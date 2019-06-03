FROM ubuntu:14.04

MAINTAINER connieviolet

RUN apt-get update
RUN apt-get install -y nginx
ADD index.html /usr/share/nginx/html/index.html

ENTRYPOINT ["/usr/share/nginx", "-g", "deamon off;"]
EXPOSE 80
