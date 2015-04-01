package com.aspose.words.api;

import com.aspose.client.ApiException;
import com.aspose.client.ApiInvoker;
import com.aspose.client.ApiInvokerResponse;

import com.aspose.words.model.BookmarksResponse;
import com.aspose.words.model.HyperlinkResponse;
import com.aspose.words.model.SplitDocumentResponse;
import com.aspose.words.model.DocumentResponse;
import com.aspose.words.model.SaveOptionsData;
import com.aspose.words.model.DocumentEntryList;
import com.aspose.words.model.FieldNamesResponse;
import com.aspose.words.model.TiffSaveOptionsData;
import com.aspose.words.model.HyperlinksResponse;
import com.aspose.words.model.TextItemsResponse;
import com.aspose.words.model.PageNumber;
import com.aspose.words.model.ParagraphLinkCollectionResponse;
import com.aspose.words.model.DocumentProperty;
import com.aspose.words.model.RunResponse;
import com.aspose.words.model.DrawingObjectsResponse;
import com.aspose.words.model.DocumentPropertyResponse;
import com.aspose.words.model.PageSetup;
import com.aspose.words.model.SectionPageSetupResponse;
import com.aspose.words.model.Font;
import com.aspose.words.model.SaaSposeResponse;
import com.aspose.words.model.RevisionsModificationResponse;
import com.aspose.words.model.SaveResponse;
import com.aspose.words.model.ProtectionDataResponse;
import com.aspose.words.model.FormFieldResponse;
import com.aspose.words.model.ResponseMessage;
import com.aspose.words.model.ProtectionRequest;
import com.aspose.words.model.SectionResponse;
import com.aspose.words.model.FormField;
import com.aspose.words.model.DocumentPropertiesResponse;
import com.aspose.words.model.BookmarkResponse;
import com.aspose.words.model.BookmarkData;
import com.aspose.words.model.ParagraphResponse;
import com.aspose.words.model.FontResponse;
import com.aspose.words.model.WatermarkText;
import com.aspose.words.model.ReplaceTextResponse;
import com.aspose.words.model.ReplaceTextRequest;
import com.aspose.words.model.StatDataResponse;
import com.aspose.words.model.SectionLinkCollectionResponse;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class WordsApi {
  String basePath = "http://api.aspose.com/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();
  ApiInvokerResponse response = null;

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentBookmarkByName
	* Read document bookmark data by its name.
	* @param name	String	The document name.
	* @param bookmarkName	String	The bookmark name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return BookmarkResponse
	*/

  public BookmarkResponse GetDocumentBookmarkByName (String name, String bookmarkName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || bookmarkName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/bookmarks/{bookmarkName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(bookmarkName!=null)
      queryParams.put("bookmarkName", String.valueOf(bookmarkName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (BookmarkResponse) ApiInvoker.deserialize(response, "", BookmarkResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentBookmarks
	* Read document bookmarks common info.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return BookmarksResponse
	*/

  public BookmarksResponse GetDocumentBookmarks (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/bookmarks/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (BookmarksResponse) ApiInvoker.deserialize(response, "", BookmarksResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostUpdateDocumentBookmark
	* Update document bookmark.
	* @param name	String	The document name.
	* @param bookmarkName	String	The bookmark name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	BookmarkData	with new bookmark data.
	* @return BookmarkResponse
	*/

  public BookmarkResponse PostUpdateDocumentBookmark (String name, String bookmarkName, String filename, String storage, String folder, BookmarkData body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || bookmarkName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/bookmarks/{bookmarkName}/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(bookmarkName!=null)
      queryParams.put("bookmarkName", String.valueOf(bookmarkName));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (BookmarkResponse) ApiInvoker.deserialize(response, "", BookmarkResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocument
	* RRead document common info.
	* @param name	String	The file name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetDocument (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentWithFormat
	* Export the document into the specified format.
	* @param name	String	The file name.
	* @param format	String	The destination format.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param outPath	String	Path to save result
	* @return ResponseMessage
	*/

  public ResponseMessage GetDocumentWithFormat (String name, String format, String storage, String folder, String outPath) {
    Object postBody = null;
    // verify required params are set
    if(name == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/?appSid={appSid}&amp;toFormat={toFormat}&amp;storage={storage}&amp;folder={folder}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostAppendDocument
	* Append documents to original document.
	* @param name	String	Original document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	Original document storage.
	* @param folder	String	Original document folder.
	* @param body	DocumentEntryList	with a list of documents to append.
	* @return DocumentResponse
	*/

  public DocumentResponse PostAppendDocument (String name, String filename, String storage, String folder, DocumentEntryList body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/appendDocument/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostExecuteTemplate
	* Populate document template with data.
	* @param name	String	The template document name.
	* @param cleanup	String	Clean up options.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param file	File	
	* @return DocumentResponse
	*/

  public DocumentResponse PostExecuteTemplate (String name, String cleanup, String filename, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/executeTemplate/?appSid={appSid}&amp;cleanup={cleanup}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(cleanup!=null)
      queryParams.put("cleanup", String.valueOf(cleanup));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostInsertPageNumbers
	* Insert document page numbers.
	* @param name	String	A document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	PageNumber	with the page numbers settings.
	* @return DocumentResponse
	*/

  public DocumentResponse PostInsertPageNumbers (String name, String filename, String storage, String folder, PageNumber body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/insertPageNumbers/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostInsertWatermarkImage
	* Insert document watermark image.
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param rotationAngle	Double	The watermark rotation angle.
	* @param image	String	The image file server full name. If the name is empty the image is expected in request content.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param file	File	
	* @return DocumentResponse
	*/

  public DocumentResponse PostInsertWatermarkImage (String name, String filename, Double rotationAngle, String image, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/insertWatermarkImage/?appSid={appSid}&amp;filename={filename}&amp;rotationAngle={rotationAngle}&amp;image={image}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(rotationAngle!=null)
      queryParams.put("rotationAngle", String.valueOf(rotationAngle));
    if(image!=null)
      queryParams.put("image", String.valueOf(image));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostInsertWatermarkText
	* Insert document watermark text.
	* @param name	String	The document name.
	* @param text	String	The text to insert.
	* @param rotationAngle	Double	The text rotation angle.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	WatermarkText	with the watermark data.            If the parameter is provided the query string parameters are ignored.
	* @return DocumentResponse
	*/

  public DocumentResponse PostInsertWatermarkText (String name, String text, Double rotationAngle, String filename, String storage, String folder, WatermarkText body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/insertWatermarkText/?appSid={appSid}&amp;text={text}&amp;rotationAngle={rotationAngle}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(text!=null)
      queryParams.put("text", String.valueOf(text));
    if(rotationAngle!=null)
      queryParams.put("rotationAngle", String.valueOf(rotationAngle));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostLoadWebDocument
	* Load new document from web into the file with any supported format of data.
	* @return SaveResponse
	*/

  public SaveResponse PostLoadWebDocument () {
    Object postBody = null;
    // create path and map variables
    String path = "/words/loadWebDocument/?appSid={appSid}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SaveResponse) ApiInvoker.deserialize(response, "", SaveResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSplitDocument
	* Split document.
	* @param name	String	Original document name.
	* @param format	String	Format to split.
	* @param from	Integer	Start page.
	* @param to	Integer	End page.
	* @param zipOutput	Boolean	ZipOutput or not.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SplitDocumentResponse
	*/

  public SplitDocumentResponse PostSplitDocument (String name, String format, Integer from, Integer to, Boolean zipOutput, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/split/?appSid={appSid}&amp;toFormat={toFormat}&amp;from={from}&amp;to={to}&amp;zipOutput={zipOutput}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(from!=null)
      queryParams.put("from", String.valueOf(from));
    if(to!=null)
      queryParams.put("to", String.valueOf(to));
    if(zipOutput!=null)
      queryParams.put("zipOutput", String.valueOf(zipOutput));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SplitDocumentResponse) ApiInvoker.deserialize(response, "", SplitDocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutConvertDocument
	* Convert document from request content to format specified.
	* @param format	String	Format to convert.
	* @param outPath	String	
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PutConvertDocument (String format, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/convert/?appSid={appSid}&amp;toFormat={toFormat}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutExecuteMailMergeOnline
	* Execute document mail merge online.
	* @param withRegions	Boolean	With regions flag.
	* @param cleanup	String	Clean up options.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PutExecuteMailMergeOnline (Boolean withRegions, String cleanup, File file) {
    Object postBody = null;
    // verify required params are set
    if(withRegions == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/executeMailMerge/?withRegions={withRegions}&amp;appSid={appSid}&amp;cleanup={cleanup}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(withRegions!=null)
      queryParams.put("withRegions", String.valueOf(withRegions));
    if(cleanup!=null)
      queryParams.put("cleanup", String.valueOf(cleanup));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostUpdateDocumentFields
	* Update (reevaluate) fields in document.
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return DocumentResponse
	*/

  public DocumentResponse PostUpdateDocumentFields (String name, String filename, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/updateFields/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteDocumentProperty
	* Delete document property.
	* @param name	String	The document name.
	* @param propertyName	String	The property name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	Document's storage.
	* @param folder	String	Document's folder.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteDocumentProperty (String name, String propertyName, String filename, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || propertyName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/documentProperties/{propertyName}/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentProperties
	* Read document properties info.
	* @param name	String	The document's name.
	* @param storage	String	The document's storage.
	* @param folder	String	The document's folder.
	* @return DocumentPropertiesResponse
	*/

  public DocumentPropertiesResponse GetDocumentProperties (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/documentProperties/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertiesResponse) ApiInvoker.deserialize(response, "", DocumentPropertiesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentProperty
	* Read document property info by the property name.
	* @param name	String	The document name.
	* @param propertyName	String	The property name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return DocumentPropertyResponse
	*/

  public DocumentPropertyResponse GetDocumentProperty (String name, String propertyName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || propertyName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/documentProperties/{propertyName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertyResponse) ApiInvoker.deserialize(response, "", DocumentPropertyResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutUpdateDocumentProperty
	* Add new or update existing document property.
	* @param name	String	The document name.
	* @param propertyName	String	The property name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	Document's storage.
	* @param folder	String	Document's folder.
	* @param body	DocumentProperty	The property with new value.
	* @return DocumentPropertyResponse
	*/

  public DocumentPropertyResponse PutUpdateDocumentProperty (String name, String propertyName, String filename, String storage, String folder, DocumentProperty body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || propertyName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/documentProperties/{propertyName}/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertyResponse) ApiInvoker.deserialize(response, "", DocumentPropertyResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteUnprotectDocument
	* Unprotect document.
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	ProtectionRequest	with protection settings.
	* @return ProtectionDataResponse
	*/

  public ProtectionDataResponse DeleteUnprotectDocument (String name, String filename, String storage, String folder, ProtectionRequest body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/protection/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (ProtectionDataResponse) ApiInvoker.deserialize(response, "", ProtectionDataResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentProtection
	* Read document protection common info.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ProtectionDataResponse
	*/

  public ProtectionDataResponse GetDocumentProtection (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/protection/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ProtectionDataResponse) ApiInvoker.deserialize(response, "", ProtectionDataResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostChangeDocumentProtection
	* Change document protection.
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	ProtectionRequest	with protection settings.
	* @return ProtectionDataResponse
	*/

  public ProtectionDataResponse PostChangeDocumentProtection (String name, String filename, String storage, String folder, ProtectionRequest body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/protection/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ProtectionDataResponse) ApiInvoker.deserialize(response, "", ProtectionDataResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutProtectDocument
	* Protect document.
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	ProtectionRequest	with protection settings.
	* @return ProtectionDataResponse
	*/

  public ProtectionDataResponse PutProtectDocument (String name, String filename, String storage, String folder, ProtectionRequest body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/protection/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ProtectionDataResponse) ApiInvoker.deserialize(response, "", ProtectionDataResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostDocumentSaveAs
	* Convert document to tiff with detailed settings and save result to storage.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	SaveOptionsData	Save options.
	* @return SaveResponse
	*/

  public SaveResponse PostDocumentSaveAs (String name, String storage, String folder, SaveOptionsData body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/SaveAs/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SaveResponse) ApiInvoker.deserialize(response, "", SaveResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutDocumentSaveAsTiff
	* Convert document to tiff with detailed settings and save result to storage.
	* @param name	String	The document name.
	* @param resultFile	String	The resulting file name.
	* @param useAntiAliasing	Boolean	Use antialiasing flag.
	* @param useHighQualityRendering	Boolean	Use high quality flag.
	* @param imageBrightness	Float	Brightness for the generated images.
	* @param imageColorMode	String	Color mode for the generated images.
	* @param imageContrast	Float	The contrast for the generated images.
	* @param numeralFormat	String	The images numeral format.
	* @param pageCount	Integer	Number of pages to render.
	* @param pageIndex	Integer	Page index to start rendering.
	* @param paperColor	String	Background image color.
	* @param pixelFormat	String	The pixel format of generated images.
	* @param resolution	Float	The resolution of generated images.
	* @param scale	Float	Zoom factor for generated images.
	* @param tiffCompression	String	The compression tipe.
	* @param dmlRenderingMode	String	Optional, default is Fallback.
	* @param dmlEffectsRenderingMode	String	Optional, default is Simplified.
	* @param tiffBinarizationMethod	String	Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param zipOutput	Boolean	Optional. A value determining zip output or not.
	* @param body	TiffSaveOptionsData	Tiff save options.
	* @return SaveResponse
	*/

  public SaveResponse PutDocumentSaveAsTiff (String name, String resultFile, Boolean useAntiAliasing, Boolean useHighQualityRendering, Float imageBrightness, String imageColorMode, Float imageContrast, String numeralFormat, Integer pageCount, Integer pageIndex, String paperColor, String pixelFormat, Float resolution, Float scale, String tiffCompression, String dmlRenderingMode, String dmlEffectsRenderingMode, String tiffBinarizationMethod, String storage, String folder, Boolean zipOutput, TiffSaveOptionsData body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/SaveAs/tiff/?appSid={appSid}&amp;resultFile={resultFile}&amp;useAntiAliasing={useAntiAliasing}&amp;useHighQualityRendering={useHighQualityRendering}&amp;imageBrightness={imageBrightness}&amp;imageColorMode={imageColorMode}&amp;imageContrast={imageContrast}&amp;numeralFormat={numeralFormat}&amp;pageCount={pageCount}&amp;pageIndex={pageIndex}&amp;paperColor={paperColor}&amp;pixelFormat={pixelFormat}&amp;resolution={resolution}&amp;scale={scale}&amp;tiffCompression={tiffCompression}&amp;dmlRenderingMode={dmlRenderingMode}&amp;dmlEffectsRenderingMode={dmlEffectsRenderingMode}&amp;tiffBinarizationMethod={tiffBinarizationMethod}&amp;storage={storage}&amp;folder={folder}&amp;zipOutput={zipOutput}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(resultFile!=null)
      queryParams.put("resultFile", String.valueOf(resultFile));
    if(useAntiAliasing!=null)
      queryParams.put("useAntiAliasing", String.valueOf(useAntiAliasing));
    if(useHighQualityRendering!=null)
      queryParams.put("useHighQualityRendering", String.valueOf(useHighQualityRendering));
    if(imageBrightness!=null)
      queryParams.put("imageBrightness", String.valueOf(imageBrightness));
    if(imageColorMode!=null)
      queryParams.put("imageColorMode", String.valueOf(imageColorMode));
    if(imageContrast!=null)
      queryParams.put("imageContrast", String.valueOf(imageContrast));
    if(numeralFormat!=null)
      queryParams.put("numeralFormat", String.valueOf(numeralFormat));
    if(pageCount!=null)
      queryParams.put("pageCount", String.valueOf(pageCount));
    if(pageIndex!=null)
      queryParams.put("pageIndex", String.valueOf(pageIndex));
    if(paperColor!=null)
      queryParams.put("paperColor", String.valueOf(paperColor));
    if(pixelFormat!=null)
      queryParams.put("pixelFormat", String.valueOf(pixelFormat));
    if(resolution!=null)
      queryParams.put("resolution", String.valueOf(resolution));
    if(scale!=null)
      queryParams.put("scale", String.valueOf(scale));
    if(tiffCompression!=null)
      queryParams.put("tiffCompression", String.valueOf(tiffCompression));
    if(dmlRenderingMode!=null)
      queryParams.put("dmlRenderingMode", String.valueOf(dmlRenderingMode));
    if(dmlEffectsRenderingMode!=null)
      queryParams.put("dmlEffectsRenderingMode", String.valueOf(dmlEffectsRenderingMode));
    if(tiffBinarizationMethod!=null)
      queryParams.put("tiffBinarizationMethod", String.valueOf(tiffBinarizationMethod));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(zipOutput!=null)
      queryParams.put("zipOutput", String.valueOf(zipOutput));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (SaveResponse) ApiInvoker.deserialize(response, "", SaveResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentStatistics
	* Read document statistics.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return StatDataResponse
	*/

  public StatDataResponse GetDocumentStatistics (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/statistics/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (StatDataResponse) ApiInvoker.deserialize(response, "", StatDataResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteDocumentWatermark
	* Delete watermark (for deleting last watermark from the document).
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return DocumentResponse
	*/

  public DocumentResponse DeleteDocumentWatermark (String name, String filename, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/watermark/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostInsertDocumentWatermarkImage
	* Insert document watermark image.
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param rotationAngle	Double	The watermark rotation angle.
	* @param image	String	The image file server full name. If the name is empty the image is expected in request content.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param file	File	
	* @return DocumentResponse
	*/

  public DocumentResponse PostInsertDocumentWatermarkImage (String name, String filename, Double rotationAngle, String image, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/watermark/insertImage/?appSid={appSid}&amp;filename={filename}&amp;rotationAngle={rotationAngle}&amp;image={image}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(rotationAngle!=null)
      queryParams.put("rotationAngle", String.valueOf(rotationAngle));
    if(image!=null)
      queryParams.put("image", String.valueOf(image));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostInsertDocumentWatermarkText
	* Insert document watermark text.
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param text	String	The text to insert.
	* @param rotationAngle	Double	The text rotation angle.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	WatermarkText	with the watermark data.            If the parameter is provided the query string parameters are ignored.
	* @return DocumentResponse
	*/

  public DocumentResponse PostInsertDocumentWatermarkText (String name, String filename, String text, Double rotationAngle, String storage, String folder, WatermarkText body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/watermark/insertText/?appSid={appSid}&amp;filename={filename}&amp;text={text}&amp;rotationAngle={rotationAngle}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(text!=null)
      queryParams.put("text", String.valueOf(text));
    if(rotationAngle!=null)
      queryParams.put("rotationAngle", String.valueOf(rotationAngle));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentDrawingObjectByIndex
	* Read document drawing object common info by its index or convert to format specified.
	* @param name	String	The document name.
	* @param objectIndex	Integer	The drawing object index.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder full path.
	* @return ResponseMessage
	*/

  public ResponseMessage GetDocumentDrawingObjectByIndex (String name, Integer objectIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || objectIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/drawingObjects/{objectIndex}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(objectIndex!=null)
      queryParams.put("objectIndex", String.valueOf(objectIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentDrawingObjectByIndexWithFormat
	* Read document drawing object common info by its index or convert to format specified.
	* @param name	String	The document name.
	* @param objectIndex	Integer	The drawing object index.
	* @param format	String	The format to convert (if specified).
	* @param storage	String	The document storage.
	* @param folder	String	The document folder full path.
	* @return ResponseMessage
	*/

  public ResponseMessage GetDocumentDrawingObjectByIndexWithFormat (String name, Integer objectIndex, String format, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || objectIndex == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/drawingObjects/{objectIndex}/?appSid={appSid}&amp;toFormat={toFormat}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(objectIndex!=null)
      queryParams.put("objectIndex", String.valueOf(objectIndex));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentDrawingObjectImageData
	* Read drawing object image data.
	* @param name	String	The document name.
	* @param objectIndex	Integer	The drawing object index.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetDocumentDrawingObjectImageData (String name, Integer objectIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || objectIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/drawingObjects/{objectIndex}/imageData/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(objectIndex!=null)
      queryParams.put("objectIndex", String.valueOf(objectIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentDrawingObjectOleData
	* Get drawing object OLE data.
	* @param name	String	The document name.
	* @param objectIndex	Integer	The object index.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetDocumentDrawingObjectOleData (String name, Integer objectIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || objectIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/drawingObjects/{objectIndex}/oleData/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(objectIndex!=null)
      queryParams.put("objectIndex", String.valueOf(objectIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentDrawingObjects
	* Read document drawing objects common info.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return DrawingObjectsResponse
	*/

  public DrawingObjectsResponse GetDocumentDrawingObjects (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/drawingObjects/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (DrawingObjectsResponse) ApiInvoker.deserialize(response, "", DrawingObjectsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteFormField
	* Removes form field from document.
	* @param name	String	The document name.
	* @param sectionIndex	Integer	Section index.
	* @param paragraphIndex	Integer	Paragraph index.
	* @param formfieldIndex	Integer	Form field index.
	* @param destFileName	String	Destination file name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteFormField (String name, Integer sectionIndex, Integer paragraphIndex, Integer formfieldIndex, String destFileName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || sectionIndex == null || paragraphIndex == null || formfieldIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/sections/{sectionIndex}/paragraphs/{paragraphIndex}/formfields/{formfieldIndex}/?appSid={appSid}&amp;destFileName={destFileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(sectionIndex!=null)
      queryParams.put("sectionIndex", String.valueOf(sectionIndex));
    if(paragraphIndex!=null)
      queryParams.put("paragraphIndex", String.valueOf(paragraphIndex));
    if(formfieldIndex!=null)
      queryParams.put("formfieldIndex", String.valueOf(formfieldIndex));
    if(destFileName!=null)
      queryParams.put("destFileName", String.valueOf(destFileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetFormField
	* Returns representation of an one of the form field.
	* @param name	String	The document name.
	* @param sectionIndex	Integer	Section index.
	* @param paragraphIndex	Integer	Paragraph index.
	* @param formfieldIndex	Integer	Form field index.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return FormFieldResponse
	*/

  public FormFieldResponse GetFormField (String name, Integer sectionIndex, Integer paragraphIndex, Integer formfieldIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || sectionIndex == null || paragraphIndex == null || formfieldIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/sections/{sectionIndex}/paragraphs/{paragraphIndex}/formfields/{formfieldIndex}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(sectionIndex!=null)
      queryParams.put("sectionIndex", String.valueOf(sectionIndex));
    if(paragraphIndex!=null)
      queryParams.put("paragraphIndex", String.valueOf(paragraphIndex));
    if(formfieldIndex!=null)
      queryParams.put("formfieldIndex", String.valueOf(formfieldIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (FormFieldResponse) ApiInvoker.deserialize(response, "", FormFieldResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostFormField
	* Updates form field's properties, returns updated form field's data.
	* @param name	String	The document name.
	* @param sectionIndex	Integer	Section index.
	* @param paragraphIndex	Integer	Paragraph index.
	* @param formfieldIndex	Integer	Form field index.
	* @param destFileName	String	Destination file name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	FormField	From field data.
	* @return FormFieldResponse
	*/

  public FormFieldResponse PostFormField (String name, Integer sectionIndex, Integer paragraphIndex, Integer formfieldIndex, String destFileName, String storage, String folder, FormField body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || sectionIndex == null || paragraphIndex == null || formfieldIndex == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/sections/{sectionIndex}/paragraphs/{paragraphIndex}/formfields/{formfieldIndex}/?appSid={appSid}&amp;destFileName={destFileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(sectionIndex!=null)
      queryParams.put("sectionIndex", String.valueOf(sectionIndex));
    if(paragraphIndex!=null)
      queryParams.put("paragraphIndex", String.valueOf(paragraphIndex));
    if(formfieldIndex!=null)
      queryParams.put("formfieldIndex", String.valueOf(formfieldIndex));
    if(destFileName!=null)
      queryParams.put("destFileName", String.valueOf(destFileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (FormFieldResponse) ApiInvoker.deserialize(response, "", FormFieldResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutFormField
	* Adds form field to paragraph, returns added form field's data.
	* @param name	String	The document name.
	* @param sectionIndex	Integer	Section index.
	* @param paragraphIndex	Integer	Paragraph index.
	* @param insertBeforeNode	String	Form field will be inserted before node with index.
	* @param destFileName	String	Destination file name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	FormField	From field data.
	* @return FormFieldResponse
	*/

  public FormFieldResponse PutFormField (String name, Integer sectionIndex, Integer paragraphIndex, String insertBeforeNode, String destFileName, String storage, String folder, FormField body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || sectionIndex == null || paragraphIndex == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/sections/{sectionIndex}/paragraphs/{paragraphIndex}/formfields/?appSid={appSid}&amp;insertBeforeNode={insertBeforeNode}&amp;destFileName={destFileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(sectionIndex!=null)
      queryParams.put("sectionIndex", String.valueOf(sectionIndex));
    if(paragraphIndex!=null)
      queryParams.put("paragraphIndex", String.valueOf(paragraphIndex));
    if(insertBeforeNode!=null)
      queryParams.put("insertBeforeNode", String.valueOf(insertBeforeNode));
    if(destFileName!=null)
      queryParams.put("destFileName", String.valueOf(destFileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (FormFieldResponse) ApiInvoker.deserialize(response, "", FormFieldResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteHeadersFooters
	* Delete document headers and footers.
	* @param name	String	The document name.
	* @param headersFootersTypes	String	List of types of headers and footers.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteHeadersFooters (String name, String headersFootersTypes, String filename, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/headersfooters/?appSid={appSid}&amp;headersFootersTypes={headersFootersTypes}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(headersFootersTypes!=null)
      queryParams.put("headersFootersTypes", String.valueOf(headersFootersTypes));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentHyperlinkByIndex
	* Read document hyperlink by its index.
	* @param name	String	The document name.
	* @param hyperlinkIndex	Integer	The hyperlink index.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return HyperlinkResponse
	*/

  public HyperlinkResponse GetDocumentHyperlinkByIndex (String name, Integer hyperlinkIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || hyperlinkIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/hyperlinks/{hyperlinkIndex}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(hyperlinkIndex!=null)
      queryParams.put("hyperlinkIndex", String.valueOf(hyperlinkIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (HyperlinkResponse) ApiInvoker.deserialize(response, "", HyperlinkResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentHyperlinks
	* Read document hyperlinks common info.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return HyperlinksResponse
	*/

  public HyperlinksResponse GetDocumentHyperlinks (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/hyperlinks/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (HyperlinksResponse) ApiInvoker.deserialize(response, "", HyperlinksResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentFieldNames
	* Read document field names.
	* @param name	String	The document name.
	* @param useNonMergeFields	Boolean	
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return FieldNamesResponse
	*/

  public FieldNamesResponse GetDocumentFieldNames (String name, Boolean useNonMergeFields, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/mailMergeFieldNames/?appSid={appSid}&amp;useNonMergeFields={useNonMergeFields}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(useNonMergeFields!=null)
      queryParams.put("useNonMergeFields", String.valueOf(useNonMergeFields));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (FieldNamesResponse) ApiInvoker.deserialize(response, "", FieldNamesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostDocumentExecuteMailMerge
	* Execute document mail merge operation.
	* @param name	String	The document name.
	* @param withRegions	Boolean	With regions flag.
	* @param mailMergeDataFile	String	Mail merge data.
	* @param cleanup	String	Clean up options.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param file	File	
	* @return DocumentResponse
	*/

  public DocumentResponse PostDocumentExecuteMailMerge (String name, Boolean withRegions, String mailMergeDataFile, String cleanup, String filename, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || withRegions == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/executeMailMerge/{withRegions}/?appSid={appSid}&amp;mailMergeDataFile={mailMergeDataFile}&amp;cleanup={cleanup}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(withRegions!=null)
      queryParams.put("withRegions", String.valueOf(withRegions));
    if(mailMergeDataFile!=null)
      queryParams.put("mailMergeDataFile", String.valueOf(mailMergeDataFile));
    if(cleanup!=null)
      queryParams.put("cleanup", String.valueOf(cleanup));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentParagraph
	* This resource represents one of the paragraphs contained in the document.
	* @param name	String	The document name.
	* @param index	Integer	Paragraph index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ParagraphResponse
	*/

  public ParagraphResponse GetDocumentParagraph (String name, Integer index, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || index == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/paragraphs/{index}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ParagraphResponse) ApiInvoker.deserialize(response, "", ParagraphResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentParagraphRun
	* This resource represents one of the paragraphs contained in the document.
	* @param name	String	The document name.
	* @param index	Integer	Paragraph index
	* @param runIndex	Integer	Run index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return RunResponse
	*/

  public RunResponse GetDocumentParagraphRun (String name, Integer index, Integer runIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || index == null || runIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/paragraphs/{index}/runs/{runIndex}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(runIndex!=null)
      queryParams.put("runIndex", String.valueOf(runIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (RunResponse) ApiInvoker.deserialize(response, "", RunResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentParagraphRunFont
	* This resource represents one of the paragraphs contained in the document.
	* @param name	String	The document name.
	* @param index	Integer	Paragraph index
	* @param runIndex	Integer	Run index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return FontResponse
	*/

  public FontResponse GetDocumentParagraphRunFont (String name, Integer index, Integer runIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || index == null || runIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/paragraphs/{index}/runs/{runIndex}/font/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(runIndex!=null)
      queryParams.put("runIndex", String.valueOf(runIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (FontResponse) ApiInvoker.deserialize(response, "", FontResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentParagraphs
	* Return a list of paragraphs that are contained in the document.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ParagraphLinkCollectionResponse
	*/

  public ParagraphLinkCollectionResponse GetDocumentParagraphs (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/paragraphs/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ParagraphLinkCollectionResponse) ApiInvoker.deserialize(response, "", ParagraphLinkCollectionResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostDocumentParagraphRunFont
	* This resource represents one of the paragraphs contained in the document.
	* @param name	String	The document name.
	* @param index	Integer	Paragraph index
	* @param runIndex	Integer	Run index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param body	Font	Font dto object
	* @return FontResponse
	*/

  public FontResponse PostDocumentParagraphRunFont (String name, Integer index, Integer runIndex, String storage, String folder, String filename, Font body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || index == null || runIndex == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/paragraphs/{index}/runs/{runIndex}/font/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;filename={filename}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(runIndex!=null)
      queryParams.put("runIndex", String.valueOf(runIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (FontResponse) ApiInvoker.deserialize(response, "", FontResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* AcceptAllRevisions
	* Accept all revisions in document
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return RevisionsModificationResponse
	*/

  public RevisionsModificationResponse AcceptAllRevisions (String name, String filename, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/revisions/acceptAll/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (RevisionsModificationResponse) ApiInvoker.deserialize(response, "", RevisionsModificationResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* RejectAllRevisions
	* Reject all revisions in document
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return RevisionsModificationResponse
	*/

  public RevisionsModificationResponse RejectAllRevisions (String name, String filename, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/revisions/rejectAll/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (RevisionsModificationResponse) ApiInvoker.deserialize(response, "", RevisionsModificationResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSection
	* Get document section by index.
	* @param name	String	The document name.
	* @param sectionIndex	Integer	Section index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SectionResponse
	*/

  public SectionResponse GetSection (String name, Integer sectionIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || sectionIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/sections/{sectionIndex}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(sectionIndex!=null)
      queryParams.put("sectionIndex", String.valueOf(sectionIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (SectionResponse) ApiInvoker.deserialize(response, "", SectionResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSectionPageSetup
	* Get page setup of section.
	* @param name	String	The document name.
	* @param sectionIndex	Integer	Section index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SectionPageSetupResponse
	*/

  public SectionPageSetupResponse GetSectionPageSetup (String name, Integer sectionIndex, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || sectionIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/sections/{sectionIndex}/pageSetup/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(sectionIndex!=null)
      queryParams.put("sectionIndex", String.valueOf(sectionIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (SectionPageSetupResponse) ApiInvoker.deserialize(response, "", SectionPageSetupResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSections
	* Return a list of sections that are contained in the document.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SectionLinkCollectionResponse
	*/

  public SectionLinkCollectionResponse GetSections (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/sections/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (SectionLinkCollectionResponse) ApiInvoker.deserialize(response, "", SectionLinkCollectionResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* UpdateSectionPageSetup
	* Update page setup of section.
	* @param name	String	The document name.
	* @param sectionIndex	Integer	Section index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
	* @param body	PageSetup	Page setup properties dto
	* @return SectionPageSetupResponse
	*/

  public SectionPageSetupResponse UpdateSectionPageSetup (String name, Integer sectionIndex, String storage, String folder, String filename, PageSetup body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || sectionIndex == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/sections/{sectionIndex}/pageSetup/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;filename={filename}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(sectionIndex!=null)
      queryParams.put("sectionIndex", String.valueOf(sectionIndex));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SectionPageSetupResponse) ApiInvoker.deserialize(response, "", SectionPageSetupResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentTextItems
	* Read document text items.
	* @param name	String	The document name.
	* @param storage	String	Document's storage.
	* @param folder	String	Document's folder.
	* @return TextItemsResponse
	*/

  public TextItemsResponse GetDocumentTextItems (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/textItems/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextItemsResponse) ApiInvoker.deserialize(response, "", TextItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostReplaceText
	* Replace document text.
	* @param name	String	The document name.
	* @param filename	String	Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	ReplaceTextRequest	with the replace operation settings.
	* @return ReplaceTextResponse
	*/

  public ReplaceTextResponse PostReplaceText (String name, String filename, String storage, String folder, ReplaceTextRequest body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/words/{name}/replaceText/?appSid={appSid}&amp;filename={filename}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ReplaceTextResponse) ApiInvoker.deserialize(response, "", ReplaceTextResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  }

