#Aspose.Words Cloud SDK for Java Repository

This repository contains Aspose.Words Cloud SDK for Java source code. This SDK allows you to work with Aspose.Words Cloud REST APIs in your Java applications quickly and easily. 

##Setup
The contents of this repository are also available as released artifacts in the
[Aspose Maven Repository](http://maven.aspose.com/repository/repo).
You can bypass this GitHub source code repository and depend directly on the released artifacts from Aspose Maven Repository by adding the following respository and dependency to development environments like Eclipse or Apache Maven:

**Aspose Maven Repository**

```
<repositories>
    <repository>
        <id>aspose-maven-repository</id>
        <name>Aspose Maven Repository</name>
        <url>http://maven.aspose.com/repository/repo</url>
    </repository>
</repositories>
```
**Maven Dependency**
```
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-cloud-sdk</artifactId>
    <version>1.0</version>
</dependency>
```
##Get Sources and Javadocs
**Maven**
```
$ mvn dependency:sources
$ mvn dependency:resolve -Dclassifier=javadoc
```
**Eclipse IDE**
```
$ mvn eclipse:eclipse -DdownloadSources=true
$ mvn eclipse:eclipse -DdownloadSources=true -DdownloadJavadocs=false
```
**pom.xml**
```
  <build>
	<plugins>
	  <plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-eclipse-plugin</artifactId>
		<configuration>
			<downloadSources>true</downloadSources>
			<downloadJavadocs>false</downloadJavadocs>
		</configuration>
	  </plugin>
	</plugins>
   </build>
```
**Direct Download**

http://maven.aspose.com/repository/repo/com/aspose/aspose-cloud-words/

##Data

In order to manipulate any files, you first need to upload them to the Aspose cloud storage or 3th party cloud storage using [Aspose.Storage Cloud SDK for Java](https://github.com/asposemarketplace/Aspose.Storage_Cloud_SDK_For_Java).

##Quick SDK Tutorial
```
// Instantiate Aspose Storage API SDK
StorageApi storageApi = new StorageApi(apiKey, appSID);

// Instantiate Aspose Words API SDK
WordsApi wordsApi = new WordsApi(apiKey, appSID);

//set input file name
String fileName = "SampleWordDocument.docx";
//set cloud storage info
String storage = null; // default: aspose cloud storage
String folder = null; //no nested folder in cloud storage

//upload input file to aspose cloud storage
storageApi.PutCreate(fileName, "", storage, new File(getClass().getResource("/" + fileName).toURI()));

//Now invoke Aspose.Storage Cloud APIs : e.g
StatDataResponse result = wordsApi.GetDocumentStatistics(fileName, storage, folder);

```
## Resources

+ **Website:** [www.aspose.com](http://www.aspose.com)
+ **Product Home:** [Aspose.Words for Cloud](http://www.aspose.com/cloud/word-api.aspx)
+ **Documentation:** [Aspose.Words for Cloud Documentation](http://www.aspose.com/docs/display/wordscloud/Home)
+ **Forum:** [Aspose.Words for Cloud Forum](http://www.aspose.com/community/forums/aspose.words-product-family/75/showforum.aspx)
+ **Blog:** [Aspose.Words for Cloud Blog](http://www.aspose.com/blogs/aspose-products/aspose-words-product-family.html)