FROM tomcat:9.0.83-jdk21-corretto-al2
COPY target/erp-0.0.1.war /usr/local/tomcat/webapps/ROOT.war
ENTRYPOINT ["/bin/bash", "/usr/local/tomcat/bin/catalina.sh", "run"]