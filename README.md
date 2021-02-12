# Init project

```shell
docker pull image couchbase
docker run -d --name couchbase -p 8091-8096:8091-8096 -p 11210:11210 couchbase
```

Go to your browser and go the url following URL http://localhost:8091
Setup the project

choose a name for the admin user and a password

## Enable developer mode
Used to be mandatory to use Collection but removed these functionalities in code because CouchBase Java SDK doesnt seems to implement well these functionalities.
Optionnal and doesnt give any benefit but hey maybe will we need it for later
```shell
docker exec -it couchbase "/bin/bash"
/opt/couchbase/bin/couchbase-cli enable-developer-preview --enable -c localhost:8091 -u admin -p testadmin
```
