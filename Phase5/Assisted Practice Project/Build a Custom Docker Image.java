Step 1.1.1: Clone Git repository
	First, clone the Git repository on a Docker host using the command below:
		git clone https://github.com/Anuj1990/Docker.git
Step 1.1.2: Docker Build
	Then, proceed with the docker build command to build a custom docker image.
cd Docker
		dockerbuild -t phpcode . -f Dockerfile

root@docker:~/Docker# docker build -t phpcode .
Sending build context to Docker daemon 337.9KB
step 1/14 : FROM ubuntu
--->93fd78260bd1
step 2/14 : ENV DEBIAN_FRONTEND=non-interactive
---> Using cache
---> b21eb69f632a
step 3/14 : RUN apt-get update -y
---> Using cache
---> d2e4866734b9
step 4/14 : RUN apt-get install -y git curl apache2 php libapache2-mod-php php-mysql
---> Using cache
---> 85f084edfc0b
step 5/14 : RUN rm -rf /var/www/html/*
---> Using cache
---> b56166da0f16
step 6/14 : ADD src /var/www/html/
---> Using cache
---> ba9e5c5c651c
step 7/14 : RUN a2enmod rewrite
---> Using cache
---> cff3e4bb8c42
step 8/14 : RUN chown -R www-data:www-data /var/www/html
---> Using cache
---> 7a4314c7b69b
step 9/14 : ENV APACHE_RUN_DIR /var/www/html
---> Using cache
---> 663a68663f90
step 10/14 : ENV APACHE_RUN_USER www-data
---> Using cache
---> 2915860f4df7
step 11/14 : ENV APACHE_RUN_GROUP www-data
---> Using cache 
---> c83847b098df
step 12/14 : ENV APACHE_LOG_DIR /var/log/apache2
---> Using cache
---> c4428c1a14db
step 13/14 : EXPOSE 80
---> Using cache 
---> 7374debb3213
step 14/14 : CND ["/usr/sbin/apache2", "-D", "FOREGROUND"]
---> Using cache
---> d35edda13537
Successfully built d35edda13537
Successfully tagged phpcode:latest
rrot@ip-172-31-25-208:~/Docker#
root@ip-172-31-25-208:~/Docker# docker images
REPOSITORY                  TAG                              IMAGE ID            CREATED                      SIZE
phpcode                     latest                           d35edda13537         20 minutes ago              291MB
ubuntu                      16.04                            a51debf7eleb         7 days ago                  116MB
root@ip-172-31-25-208:~/Docker#