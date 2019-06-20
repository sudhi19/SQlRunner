package com.sample.sqlrunner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private static final String NEW_LINE_CHAR = "\n";
    @Autowired
    SQLUtils sqlUtils;
@Autowired
DBProperties dbProperties;
    @GetMapping("/runsql/antrunner")
    @ResponseStatus(HttpStatus.OK)
   String runAntSQL(@RequestParam("path") String filename) {
        LogUtil.logger.log(Level.INFO,"SQL File Name:"+filename);
        return dbProperties.toString()+NEW_LINE_CHAR+sqlUtils.executeSqlUsingAnt(filename);
    }
        @GetMapping("/runsql/ibatisrunner")
        @ResponseStatus(HttpStatus.OK)
        String runIbatisSQL(@RequestParam("path") String filename) {
            LogUtil.logger.log(Level.INFO,"SQL File Name:"+filename);
           return dbProperties.toString()+NEW_LINE_CHAR+sqlUtils.executeScriptUsingScriptRunner(filename);

        }
    @GetMapping("/runsql/jdbcstatement")
    @ResponseStatus(HttpStatus.OK)
    String runStatementSQL(@RequestParam("path") String filename) {
        LogUtil.logger.log(Level.INFO,"SQL File Name:"+filename);
        return dbProperties.toString()+NEW_LINE_CHAR+sqlUtils.executeScriptUsingStatement(filename);

    }
}
