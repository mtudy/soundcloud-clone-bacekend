# SoundCloud CLone Backend

## Requirements
* Docker
* docker-compose
* Make
* JDK11

## Getting Started
```bash
cp docker/.env.example docker/.env
cp src/main/resources/example.application.properties src/main/resources/application.properties
cp src/test/resources/example.application-default.properties src/test/resources/application-default.properties

mkdir -p src/resources/db/migration
make start
```
