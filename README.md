# MultiStorage-DistributedFileSystem

A mini multi-storage distributed system that mimicks geo-spatial distribution of data storage centers similar to cloud storage services like Google Drive,
Dropbox etc that ensures abstraction, high availability, scalability and failure tolerance.


## Pre-requisites
Install Java and set environment variables.
In FileServerImpl.java, change 'E://Movies' path to your own
similarly for FileServerImpl2.java

## Installation


```bash
\server> javac *.javac
\server> start rmiregistry
```
Starting the 3 servers
```bash
\server> java FileServer movies
\server> java FileServer series
\server> java FileServer backup
```
Copy FileServerIntf.class and FileServerIntf3.java to client dir
```bash
\client> javac FileClient.java
\server> java FileClient
```

## How to use

```bash
\client> ls
\client> cd movies
\client> ls
\client> cd ..
\client> cd series
\client> ls
```
Crash any movie or series server and try to access it again from client, backup server should be taking care for the crashed servers.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
