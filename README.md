# mvn_java_cloud_run_job
create maven java in cloud run job and call cloud run service written in spring boot rest


>>Authentication to Clourd Run Service
https://cloud.google.com/run/docs/authenticating/service-to-service#run-service-to-service-example-java
https://cloud.google.com/run/docs/configuring/custom-audiences
By convention, the audience is the full URL of the target service. By default in Cloud Run, this is the Google-generated URL for a service ending in run.app.

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