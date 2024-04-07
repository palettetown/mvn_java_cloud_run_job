# mvn_java_cloud_run_job
create maven java in cloud run job and call cloud run service written in spring boot rest





Error:
#13 8.747 [INFO] Compiling 3 source files to /usr/src/app/target/classes
#13 8.966 [INFO] -------------------------------------------------------------
#13 8.967 [ERROR] COMPILATION ERROR :
#13 8.967 [INFO] -------------------------------------------------------------
#13 8.967 [ERROR] Source option 5 is no longer supported. Use 7 or later.
#13 8.967 [ERROR] Target option 5 is no longer supported. Use 7 or later.

Resolution:
Add this
    <properties>
       <maven.compiler.source>17</maven.compiler.source>
       <maven.compiler.target>17</maven.compiler.target>
    </properties>