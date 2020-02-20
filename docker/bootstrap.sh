#!/bin/sh

# create docker new image
docker build --no-cache=true -t torimo-search/jar:latest ./api/

# docker-compose restart
docker-compose down
docker-compose up -d

# delete docker none image
docker image rm $(docker image ls  --filter "dangling=true" -aq)
