package com.sample.sqlrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
@Component
public class LogUtil {
@Autowired
 DBProperties dbProperties;
    static Logger logger = Logger.getLogger("SQL Runner");
    static FileHandler fh;

    public  void bindLogger() {

        try {

          //  System.out.println(dbProperties);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dbProperties.getLog_file_date_format());

            String dateString = simpleDateFormat.format(new Date());
String logFilePath=dbProperties.getLog_file_path()+"SQL_EXE_Log_"+dateString+".txt";

            fh = new FileHandler(logFilePath);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            logger.info("Logger Initialized....");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            logger.log(Level.SEVERE,"Exception Occured",e);
            e.printStackTrace();
        }



    }

}
