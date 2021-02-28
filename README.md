# Contract-First-WebService
This project host a simple Soap Webservice developed using JAX-WS and Apache-Cxf. The service is developed using a TopDown Approach(WSDL first).When consumed; The webService requires the client to provide a country and its city,then the service generated the current UTC time for that city.

## Requirements

1. Java - 1.8 

2. Maven 

3. Mysql 

4. Tomcat server 7.0 +

5. Eclipse for enterprise developers flavour

## Steps to Setup

**1. Clone the application**

`git clone https://github.com/bobmwangih/Contract-First-WebService.git`

**2. Generate webService classes from the WSDL**
+ wsdl file can be found under the `resources` package

+ Check the project build structure as defined in the `pom.xml file `

+ Right click on the root Project and click on `run as` - then navigate to `generate maven generate sources	`

+ if you didn't change the folder structure,the generated resources should be in a folder called `generated-sources ` under a package called 'webServicesResources`


**3. Deploy the application using TomCat**

+ right click on the project and click on ` run as` the click on `run on server` after which you will click your installed tom cat version and run

+ after the application has been deployed successfully, on the browser navigate to  `http://localhost:8080/TopDownApproach/services` and you should find the wsdl that is ready for consumption using any type of a client. 

## Cheers!

