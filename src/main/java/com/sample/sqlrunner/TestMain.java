//package com.sample.sqlrunner;
//
//
//import org.apache.ibatis.jdbc.ScriptRunner;
//import org.apache.tools.ant.Project;
//import org.apache.tools.ant.taskdefs.SQLExec;
//
//import java.io.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class TestMain {
//        private void executeSql(String sqlFilePath) {
//            final class SqlExecuter extends SQLExec {
//                public SqlExecuter() {
//                    Project project = new Project();
//                    project.init();
//                    setProject(project);
//                    setTaskType("sql");
//                    setTaskName("sql");
//                }
//            }
//
////            SqlExecuter executer = new SqlExecuter();
////            executer.setSrc(new File(sqlFilePath));
////            executer.setDriver(SQLUtils.DRIVER_NAME);
////            executer.setPassword(SQLUtils.PASSWORD);
////            executer.setUserid(SQLUtils.USER);
////            executer.setUrl(SQLUtils.URL);
////            executer.execute();
//        }
//
//        static void executeScriptUsingScriptRunner() throws IOException, SQLException {
//            // initialize script path
//            String scriptFilePath = "d:/test/test.sql";
//            Reader reader = null;
//            Connection con = null;
//            try {
//
//                // create ScripRunner object
//                System.out.println(con);
//                ScriptRunner scriptExecutor = new ScriptRunner(new SQLUtils().getConnection());
//                // initialize file reader
//                reader = new BufferedReader(new FileReader(scriptFilePath));
//                // execute script with file reader as input
//                scriptExecutor.runScript(reader);
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                // close file reader
//                if (reader != null) {
//                    reader.close();
//                }
//                // close db connection
//                if (con != null) {
//                    con.close();
//                }
//            }
//        }
//        public static void main(String argv[]) {
//           // new TestMain().executeSql("D:\\test\\test.sql");
//
//
//            try {
//                executeScriptUsingScriptRunner();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//
////            try {
////                String line;
////                Process p = Runtime.getRuntime().exec
////                        ("C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysql.exe -u root -p root -d sample_schema -h localhost -f D:\\test\\test.sql");
////                BufferedReader input =
////                        new BufferedReader
////                                (new InputStreamReader(p.getInputStream()));
////                while ((line = input.readLine()) != null) {
////                    System.out.println(line);
////                }
////                input.close();
////            }
////            catch (Exception err) {
////                err.printStackTrace();
////            }
//        }
//    }
//
