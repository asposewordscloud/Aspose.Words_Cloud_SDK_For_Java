/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.words.api;

import com.aspose.client.ApiInvoker;
import com.aspose.words.api.WordsApi;
import com.aspose.storage.api.StorageApi;
import com.aspose.client.ApiException;

import com.aspose.words.model.BookmarkData;
import com.aspose.words.model.BookmarkResponse;
import com.aspose.words.model.BookmarksResponse;
import com.aspose.words.model.DocumentEntryList;
import com.aspose.words.model.DocumentPropertiesResponse;
import com.aspose.words.model.DocumentProperty;
import com.aspose.words.model.DocumentPropertyResponse;
import com.aspose.words.model.DocumentResponse;
import com.aspose.words.model.DrawingObjectsResponse;
import com.aspose.words.model.FieldNamesResponse;
import com.aspose.words.model.Font;
import com.aspose.words.model.FontResponse;
import com.aspose.words.model.FormField;
import com.aspose.words.model.FormFieldResponse;
import com.aspose.words.model.HyperlinkResponse;
import com.aspose.words.model.HyperlinksResponse;
import com.aspose.words.model.PageNumber;
import com.aspose.words.model.PageSetup;
import com.aspose.words.model.ParagraphLinkCollectionResponse;
import com.aspose.words.model.ParagraphResponse;
import com.aspose.words.model.ProtectionDataResponse;
import com.aspose.words.model.ProtectionRequest;
import com.aspose.words.model.ReplaceTextRequest;
import com.aspose.words.model.ReplaceTextResponse;
import com.aspose.words.model.ResponseMessage;
import com.aspose.words.model.RevisionsModificationResponse;
import com.aspose.words.model.RunResponse;
import com.aspose.words.model.SaaSposeResponse;
import com.aspose.words.model.SaveOptionsData;
import com.aspose.words.model.SaveResponse;
import com.aspose.words.model.SectionLinkCollectionResponse;
import com.aspose.words.model.SectionPageSetupResponse;
import com.aspose.words.model.SectionResponse;
import com.aspose.words.model.SplitDocumentResponse;
import com.aspose.words.model.StatDataResponse;
import com.aspose.words.model.TextItemsResponse;
import com.aspose.words.model.TiffSaveOptionsData;
import com.aspose.words.model.WatermarkText;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SQL
 */
public class WordsApiTest {

	WordsApi wordsApi;
	StorageApi storageApi;
	// Please get the appSID and apiKey from https://cloud.aspose.com
	String appSID = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx";
	String apiKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";

	public WordsApiTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
		wordsApi = new WordsApi();
		wordsApi.setBasePath("http://api.aspose.com/v1.1");
		wordsApi.getInvoker().addDefaultHeader("apiKey", apiKey);
		wordsApi.getInvoker().addDefaultHeader("appSID", appSID);

//		storageApi = new StorageApi();
//		storageApi.setBasePath("http://api.aspose.com/v1.1");
//		storageApi.getInvoker().addDefaultHeader("apiKey", apiKey);
//		storageApi.getInvoker().addDefaultHeader("appSID", appSID);
//
//		try{
//		storageApi.PutCopy("test_convertlocal.docx", "", "", "", "", new File(getClass().getResource("/test_convertlocal.docx").toURI()));
//		//storageApi.PutCopy("test_multi_pages.docx", "", "", "", "", new File(getClass().getResource("/test_multi_pages.docx").toURI()));
//		//storageApi.PutCopy("test_uploadfile.docx", "", "", "", "", new File(getClass().getResource("/test_uploadfile.docx").toURI()));
//		
//		}catch(java.net.URISyntaxException uriExp){
//			System.out.println("uriExp:"+uriExp);
//		}

	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of GetDocumentBookmarkByName method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentBookmarkByName() {
		System.out.println("GetDocumentBookmarkByName");
		String name = "test_multi_pages.docx";
		String bookmarkName = "_GoBack";
		String storage = "";
		String folder = "";
		try {
			
			BookmarkResponse result = wordsApi.GetDocumentBookmarkByName(name, bookmarkName, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentBookmarks method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentBookmarks() {
		System.out.println("GetDocumentBookmarks");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {
			BookmarksResponse result = wordsApi.GetDocumentBookmarks(name, storage, folder);
		
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostUpdateDocumentBookmark method, of class WordsApi.
	 */
	@Test
	public void testPostUpdateDocumentBookmark() {
		System.out.println("PostUpdateDocumentBookmark");
		String name = "test_multi_pages.docx";
		String bookmarkName = "test";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		BookmarkData body = new BookmarkData();
		body.setName("newBookmark");
		body.setText("This is new Bookmark");
		try {
			BookmarkResponse result = wordsApi.PostUpdateDocumentBookmark(name, bookmarkName, filename, storage, folder, body);			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocument method, of class WordsApi.
	 */
	@Test
	public void testGetDocument() {
		System.out.println("GetDocument");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {
			ResponseMessage result = wordsApi.GetDocument(name, storage, folder);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentWithFormat method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentWithFormat() {
		System.out.println("GetDocumentWithFormat");
		String name = "test_multi_pages.docx";
		String format = "text";
		String storage = "";
		String folder = "";
		String outPath = "";
		try {
			ResponseMessage result = wordsApi.GetDocumentWithFormat(name, format, storage, folder, outPath);
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostAppendDocument method, of class WordsApi.
	 */
	@Test
	public void testPostAppendDocument() {
		System.out.println("PostAppendDocument");
		String name = "test_multi_pages.docx";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		DocumentEntryList body = new DocumentEntryList();
		List<com.aspose.words.model.DocumentEntry> docEntries = new ArrayList();
		
		com.aspose.words.model.DocumentEntry docEntry = new com.aspose.words.model.DocumentEntry();
		docEntry.setHref("this");
		docEntries.add(docEntry);		
		body.setDocumentEntries(docEntries);
		
		try {
			DocumentResponse result = wordsApi.PostAppendDocument(name, filename, storage, folder, body);
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostExecuteTemplate method, of class WordsApi.
	 */
	@Test
	public void testPostExecuteTemplate() {
		System.out.println("PostExecuteTemplate");
		String name = "test_multi_pages.docx";
		String cleanup = "yes";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		File file;
		try {
			file = new File(getClass().getResource("/test_uploadfile.docx").toURI());
			DocumentResponse result = wordsApi.PostExecuteTemplate(name, cleanup, filename, storage, folder, file);			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		} catch(java.net.URISyntaxException uriExp){
			System.out.println("uri exp:" + uriExp.getMessage());
		}

	}

	/**
	 * Test of PostInsertPageNumbers method, of class WordsApi.
	 */
	@Test
	public void testPostInsertPageNumbers() {
		System.out.println("PostInsertPageNumbers");
		String name = "test_multi_pages.docx";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		PageNumber body = new PageNumber();
		body.setAlignment("center");
		try {
			DocumentResponse result = wordsApi.PostInsertPageNumbers(name, filename, storage, folder, body);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostInsertWatermarkImage method, of class WordsApi.
	 */
	@Test
	public void testPostInsertWatermarkImage() {
		System.out.println("PostInsertWatermarkImage");
		String name = "test_multi_pages.docx";
		String filename = "test_multi_pages.docx";
		Double rotationAngle = 90.0;
		String image = "this";
		String storage = "";
		String folder = "";
		File file;
		try {
			file = new File(getClass().getResource("/test_uploadfile.docx").toURI());
			DocumentResponse result = wordsApi.PostInsertWatermarkImage(name, filename, rotationAngle, image, storage, folder, file);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		} catch(java.net.URISyntaxException uriExp){
			System.out.println("uri exp:" + uriExp.getMessage());
		}

	}

	/**
	 * Test of PostInsertWatermarkText method, of class WordsApi.
	 */
	@Test
	public void testPostInsertWatermarkText() {
		System.out.println("PostInsertWatermarkText");
		String name = "test_multi_pages.docx";
		String text = "New";
		Double rotationAngle = 90.0;
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		WatermarkText body = new WatermarkText();
		body.setText("text");
		try {
			DocumentResponse result = wordsApi.PostInsertWatermarkText(name, text, rotationAngle, filename, storage, folder, body);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostLoadWebDocument method, of class WordsApi.
	 */
	@Test
	public void testPostLoadWebDocument() {
		System.out.println("PostLoadWebDocument");
		try {
			SaveResponse result = wordsApi.PostLoadWebDocument();
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostSplitDocument method, of class WordsApi.
	 */
	@Test
	public void testPostSplitDocument() {
		System.out.println("PostSplitDocument");
		String name = "test_multi_pages.docx";
		String format = "text";
		Integer from = 1;
		Integer to = 2;
		Boolean zipOutput = false;
		String storage = "";
		String folder = "";
		try {
			SplitDocumentResponse result = wordsApi.PostSplitDocument(name, format, from, to, zipOutput, storage, folder);
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PutConvertDocument method, of class WordsApi.
	 */
	@Test
	public void testPutConvertDocument() {
		System.out.println("PutConvertDocument");
		String format = "text";
		String outPath = "";
		File file;
		try {
			file = new File(getClass().getResource("/test_uploadfile.docx").toURI());
			ResponseMessage result = wordsApi.PutConvertDocument(format, outPath, file);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		} catch(java.net.URISyntaxException uriExp){
			System.out.println("uri exp:" + uriExp.getMessage());
		}

	}

	/**
	 * Test of PutExecuteMailMergeOnline method, of class WordsApi.
	 */
	@Test
	public void testPutExecuteMailMergeOnline() {
		System.out.println("PutExecuteMailMergeOnline");
		Boolean withRegions = false;
		String cleanup = "yes";
		File file;
		try {
			file = new File(getClass().getResource("/test_uploadfile.docx").toURI());
			ResponseMessage result = wordsApi.PutExecuteMailMergeOnline(withRegions, cleanup, file);
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		} catch(java.net.URISyntaxException uriExp){
			System.out.println("uri exp:" + uriExp.getMessage());
		}

	}

	/**
	 * Test of PostUpdateDocumentFields method, of class WordsApi.
	 */
	@Test
	public void testPostUpdateDocumentFields() {
		System.out.println("PostUpdateDocumentFields");
		String name = "test_multi_pages.docx";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {
			DocumentResponse result = wordsApi.PostUpdateDocumentFields(name, filename, storage, folder);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of DeleteDocumentProperty method, of class WordsApi.
	 */
	@Test
	public void testDeleteDocumentProperty() {
		System.out.println("DeleteDocumentProperty");
		String name = "test_multi_pages.docx";
		String propertyName = "Author";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {
			SaaSposeResponse result = wordsApi.DeleteDocumentProperty(name, propertyName, filename, storage, folder);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentProperties method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentProperties() {
		System.out.println("GetDocumentProperties");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {
			DocumentPropertiesResponse result = wordsApi.GetDocumentProperties(name, storage, folder);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentProperty method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentProperty() {
		System.out.println("GetDocumentProperty");
		String name = "test_multi_pages.docx";
		String propertyName = "Author";
		String storage = "";
		String folder = "";
		try {
			DocumentPropertyResponse result = wordsApi.GetDocumentProperty(name, propertyName, storage, folder);
		
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PutUpdateDocumentProperty method, of class WordsApi.
	 */
	@Test
	public void testPutUpdateDocumentProperty() {
		System.out.println("PutUpdateDocumentProperty");
		String name = "test_multi_pages.docx";
		String propertyName = "Author";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		DocumentProperty body = new DocumentProperty();
		body.setName("Author");
		body.setValue("Imran Anwar");
		try {
			DocumentPropertyResponse result = wordsApi.PutUpdateDocumentProperty(name, propertyName, filename, storage, folder, body);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of DeleteUnprotectDocument method, of class WordsApi.
	 */
	@Test
	public void testDeleteUnprotectDocument() {
		System.out.println("DeleteUnprotectDocument");
		String name = "test_multi_pages.docx";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		ProtectionRequest body = new ProtectionRequest();
		body.setNewPassword("");
		try {
			ProtectionDataResponse result = wordsApi.DeleteUnprotectDocument(name, filename, storage, folder, body);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentProtection method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentProtection() {
		System.out.println("GetDocumentProtection");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {
			ProtectionDataResponse result = wordsApi.GetDocumentProtection(name, storage, folder);
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostChangeDocumentProtection method, of class WordsApi.
	 */
	@Test
	public void testPostChangeDocumentProtection() {
		System.out.println("PostChangeDocumentProtection");
		String name = "test_multi_pages.docx";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		ProtectionRequest body = new ProtectionRequest();
		body.setNewPassword("");
		try {
			ProtectionDataResponse result = wordsApi.PostChangeDocumentProtection(name, filename, storage, folder, body);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PutProtectDocument method, of class WordsApi.
	 */
	@Test
	public void testPutProtectDocument() {
		System.out.println("PutProtectDocument");
		String name = "test_multi_pages.docx";
		String filename = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		ProtectionRequest body = new ProtectionRequest();
		try {
			ProtectionDataResponse result = wordsApi.PutProtectDocument(name, filename, storage, folder, body);
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostDocumentSaveAs method, of class WordsApi.
	 */
	@Test
	public void testPostDocumentSaveAs() {
		System.out.println("PostDocumentSaveAs");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		SaveOptionsData body = new SaveOptionsData();
		body.setFileName("this.docx");
		try {
			SaveResponse result = wordsApi.PostDocumentSaveAs(name, storage, folder, body);
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PutDocumentSaveAsTiff method, of class WordsApi.
	 */
	@Test
	public void testPutDocumentSaveAsTiff() {
		System.out.println("PutDocumentSaveAsTiff");
		String name = "test_multi_pages.docx";
		String resultFile = "test.docx";
		Boolean useAntiAliasing = false;
		Boolean useHighQualityRendering = false;
		Float imageBrightness = 5f;
		String imageColorMode = "true";
		Float imageContrast =5f;
		String numeralFormat = "true";
		Integer pageCount = 1;
		Integer pageIndex = 1;
		String paperColor = "#ff000000";
		String pixelFormat = "32x32";
		Float resolution = 128f;
		Float scale = 5f;
		String tiffCompression = "test";
		String dmlRenderingMode = "test";
		String dmlEffectsRenderingMode = "test";
		String tiffBinarizationMethod = "test";
		String storage = "";
		String folder = "";
		Boolean zipOutput = false;
		TiffSaveOptionsData body = new TiffSaveOptionsData();
		body.setSaveFormat("tiff");
		try {
			SaveResponse result = wordsApi.PutDocumentSaveAsTiff(name, resultFile, useAntiAliasing, useHighQualityRendering, imageBrightness, imageColorMode, imageContrast, numeralFormat, pageCount, pageIndex, paperColor, pixelFormat, resolution, scale, tiffCompression, dmlRenderingMode, dmlEffectsRenderingMode, tiffBinarizationMethod, storage, folder, zipOutput, body);
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentStatistics method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentStatistics() {
		System.out.println("GetDocumentStatistics");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {
			StatDataResponse result = wordsApi.GetDocumentStatistics(name, storage, folder);
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of DeleteDocumentWatermark method, of class WordsApi.
	 */
	@Test
	public void testDeleteDocumentWatermark() {
		System.out.println("DeleteDocumentWatermark");
		String name = "test_multi_pages.docx";
		String filename = "test.docx";
		String storage = "";
		String folder = "";
		try {
			DocumentResponse result = wordsApi.DeleteDocumentWatermark(name, filename, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostInsertDocumentWatermarkImage method, of class WordsApi.
	 */
	@Test
	public void testPostInsertDocumentWatermarkImage() {
		System.out.println("PostInsertDocumentWatermarkImage");
		String name = "test_multi_pages.docx";
		String filename = "test.docx";
		Double rotationAngle = 90.0;
		String image = "img";
		String storage = "";
		String folder = "";
		File file;		
		
		try {
			file = new File(getClass().getResource("/test_uploadfile.docx").toURI());
			DocumentResponse result = wordsApi.PostInsertDocumentWatermarkImage(name, filename, rotationAngle, image, storage, folder, file);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		} catch(java.net.URISyntaxException uriExp){
			System.out.println("uri exp:" + uriExp.getMessage());
		}
		
	}

	/**
	 * Test of PostInsertDocumentWatermarkText method, of class WordsApi.
	 */
	@Test
	public void testPostInsertDocumentWatermarkText() {
		System.out.println("PostInsertDocumentWatermarkText");
		String name = "test_multi_pages.docx";
		String filename = "test.docx";
		String text = "test";
		Double rotationAngle = 60.0;
		String storage = "";
		String folder = "";
		WatermarkText body = new WatermarkText();
		try {
			DocumentResponse result = wordsApi.PostInsertDocumentWatermarkText(name, filename, text, rotationAngle, storage, folder, body);

		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentDrawingObjectByIndex method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentDrawingObjectByIndex() {
		System.out.println("GetDocumentDrawingObjectByIndex");
		String name = "test_multi_pages.docx";
		Integer objectIndex = 1;
		String storage = "";
		String folder = "";
		try {
			ResponseMessage result = wordsApi.GetDocumentDrawingObjectByIndex(name, objectIndex, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentDrawingObjectByIndexWithFormat method, of class
	 * WordsApi.
	 */
	@Test
	public void testGetDocumentDrawingObjectByIndexWithFormat() {
		System.out.println("GetDocumentDrawingObjectByIndexWithFormat");
		String name = "test_multi_pages.docx";
		Integer objectIndex = 1;
		String format = "text";
		String storage = "";
		String folder = "";
		try {
			ResponseMessage result = wordsApi.GetDocumentDrawingObjectByIndexWithFormat(name, objectIndex, format, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentDrawingObjectImageData method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentDrawingObjectImageData() {
		System.out.println("GetDocumentDrawingObjectImageData");
		String name = "test_multi_pages.docx";
		Integer objectIndex = 1;
		String storage = "";
		String folder = "";
		try {
			ResponseMessage result = wordsApi.GetDocumentDrawingObjectImageData(name, objectIndex, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentDrawingObjectOleData method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentDrawingObjectOleData() {
		System.out.println("GetDocumentDrawingObjectOleData");
		String name = "test_multi_pages.docx";
		Integer objectIndex = 1;
		String storage = "";
		String folder = "";
		try {
			ResponseMessage result = wordsApi.GetDocumentDrawingObjectOleData(name, objectIndex, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentDrawingObjects method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentDrawingObjects() {
		System.out.println("GetDocumentDrawingObjects");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {
			DrawingObjectsResponse result = wordsApi.GetDocumentDrawingObjects(name, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of DeleteFormField method, of class WordsApi.
	 */
	@Test
	public void testDeleteFormField() {
		System.out.println("DeleteFormField");
		String name = "test_multi_pages.docx";
		Integer sectionIndex = 1;
		Integer paragraphIndex = 1;
		Integer formfieldIndex = 1;
		String destFileName = "test.docx";
		String storage = "";
		String folder = "";
		try {
			SaaSposeResponse result = wordsApi.DeleteFormField(name, sectionIndex, paragraphIndex, formfieldIndex, destFileName, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetFormField method, of class WordsApi.
	 */
	@Test
	public void testGetFormField() {
		System.out.println("GetFormField");
		String name = "test_multi_pages.docx";
		Integer sectionIndex = 1;
		Integer paragraphIndex = 1;
		Integer formfieldIndex = 1;
		String storage = "";
		String folder = "";
		try {
			FormFieldResponse result = wordsApi.GetFormField(name, sectionIndex, paragraphIndex, formfieldIndex, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostFormField method, of class WordsApi.
	 */
	@Test
	public void testPostFormField() {
		System.out.println("PostFormField");
		String name = "test_multi_pages.docx";
		Integer sectionIndex = 1;
		Integer paragraphIndex = 1;
		Integer formfieldIndex = 1;
		String destFileName = "test.docx";
		String storage = "";
		String folder = "";
		FormField body = new FormField();
		body.setName("file");
		try {

			FormFieldResponse result = wordsApi.PostFormField(name, sectionIndex, paragraphIndex, formfieldIndex, destFileName, storage, folder, body);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PutFormField method, of class WordsApi.
	 */
	@Test
	public void testPutFormField() {
		System.out.println("PutFormField");
		String name = "test_multi_pages.docx";
		Integer sectionIndex = 1;
		Integer paragraphIndex = 1;
		String insertBeforeNode = "Yes";
		String destFileName = "test.docx";
		String storage = "";
		String folder = "";
		FormField body = new FormField();
		try {
			FormFieldResponse result = wordsApi.PutFormField(name, sectionIndex, paragraphIndex, insertBeforeNode, destFileName, storage, folder, body);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of DeleteHeadersFooters method, of class WordsApi.
	 */
	@Test
	public void testDeleteHeadersFooters() {
		System.out.println("DeleteHeadersFooters");
		String name = "test_multi_pages.docx";
		String headersFootersTypes = "vew";
		String filename = "test.docx";
		String storage = "";
		String folder = "";
		try {

			SaaSposeResponse result = wordsApi.DeleteHeadersFooters(name, headersFootersTypes, filename, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentHyperlinkByIndex method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentHyperlinkByIndex() {
		System.out.println("GetDocumentHyperlinkByIndex");
		String name = "test_multi_pages.docx";
		Integer hyperlinkIndex = 1;
		String storage = "";
		String folder = "";
		try {
			HyperlinkResponse result = wordsApi.GetDocumentHyperlinkByIndex(name, hyperlinkIndex, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentHyperlinks method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentHyperlinks() {
		System.out.println("GetDocumentHyperlinks");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {

			HyperlinksResponse result = wordsApi.GetDocumentHyperlinks(name, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentFieldNames method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentFieldNames() {
		System.out.println("GetDocumentFieldNames");
		String name = "test_multi_pages.docx";
		Boolean useNonMergeFields = false;
		String storage = "";
		String folder = "";
		try {

			FieldNamesResponse result = wordsApi.GetDocumentFieldNames(name, useNonMergeFields, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostDocumentExecuteMailMerge method, of class WordsApi.
	 */
	@Test
	public void testPostDocumentExecuteMailMerge() {
		System.out.println("PostDocumentExecuteMailMerge");
		String name = "test_multi_pages.docx";
		Boolean withRegions = false;
		String mailMergeDataFile = "test.docs";
		String cleanup = "yes";
		String filename = "test.docx";
		String storage = "";
		String folder = "";
		File file;
		try {
			file = new File(getClass().getResource("/test_uploadfile.docx").toURI());
			DocumentResponse result = wordsApi.PostDocumentExecuteMailMerge(name, withRegions, mailMergeDataFile, cleanup, filename, storage, folder, file);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		} catch(java.net.URISyntaxException uriExp){
			System.out.println("uri exp:" + uriExp.getMessage());
		}


	}

	/**
	 * Test of GetDocumentParagraph method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentParagraph() {
		System.out.println("GetDocumentParagraph");
		String name = "test_multi_pages.docx";
		Integer index = 1;
		String storage = "";
		String folder = "";
		try {
			ParagraphResponse result = wordsApi.GetDocumentParagraph(name, index, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentParagraphRun method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentParagraphRun() {
		System.out.println("GetDocumentParagraphRun");
		String name = "test_multi_pages.docx";
		Integer index = 1;
		Integer runIndex = 1;
		String storage = "";
		String folder = "";
		try {

			RunResponse result = wordsApi.GetDocumentParagraphRun(name, index, runIndex, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentParagraphRunFont method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentParagraphRunFont() {
		System.out.println("GetDocumentParagraphRunFont");
		String name = "test_multi_pages.docx";
		Integer index = 1;
		Integer runIndex = 1;
		String storage = "";
		String folder = "";
		try {

			FontResponse result = wordsApi.GetDocumentParagraphRunFont(name, index, runIndex, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentParagraphs method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentParagraphs() {
		System.out.println("GetDocumentParagraphs");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {
			
			ParagraphLinkCollectionResponse result = wordsApi.GetDocumentParagraphs(name, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostDocumentParagraphRunFont method, of class WordsApi.
	 */
	@Test
	public void testPostDocumentParagraphRunFont() {
		System.out.println("PostDocumentParagraphRunFont");
		String name = "test_multi_pages.docx";
		Integer index = 1;
		Integer runIndex = 1;
		String storage = "";
		String folder = "";
		String filename = "test.docx";
		Font body = new Font();
		body.setBold(true);
		try {

			FontResponse result = wordsApi.PostDocumentParagraphRunFont(name, index, runIndex, storage, folder, filename, body);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of AcceptAllRevisions method, of class WordsApi.
	 */
	@Test
	public void testAcceptAllRevisions() {
		System.out.println("AcceptAllRevisions");
		String name = "test_multi_pages.docx";
		String filename = "test.docx";
		String storage = "";
		String folder = "";
		try {

			RevisionsModificationResponse result = wordsApi.AcceptAllRevisions(name, filename, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of RejectAllRevisions method, of class WordsApi.
	 */
	@Test
	public void testRejectAllRevisions() {
		System.out.println("RejectAllRevisions");
		String name = "test_multi_pages.docx";
		String filename = "test.docx";
		String storage = "";
		String folder = "";
		try {

			RevisionsModificationResponse result = wordsApi.RejectAllRevisions(name, filename, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetSection method, of class WordsApi.
	 */
	@Test
	public void testGetSection() {
		System.out.println("GetSection");
		String name = "test_multi_pages.docx";
		Integer sectionIndex = 1;
		String storage = "";
		String folder = "";
		try {

			SectionResponse result = wordsApi.GetSection(name, sectionIndex, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetSectionPageSetup method, of class WordsApi.
	 */
	@Test
	public void testGetSectionPageSetup() {
		System.out.println("GetSectionPageSetup");
		String name = "test_multi_pages.docx";
		Integer sectionIndex = 1;
		String storage = "";
		String folder = "";
		try {

			SectionPageSetupResponse result = wordsApi.GetSectionPageSetup(name, sectionIndex, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetSections method, of class WordsApi.
	 */
	@Test
	public void testGetSections() {
		System.out.println("GetSections");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {

			SectionLinkCollectionResponse result = wordsApi.GetSections(name, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of UpdateSectionPageSetup method, of class WordsApi.
	 */
	@Test
	public void testUpdateSectionPageSetup() {
		System.out.println("UpdateSectionPageSetup");
		String name = "test_multi_pages.docx";
		Integer sectionIndex = 1;
		String storage = "";
		String folder = "";
		String filename = "";
		PageSetup body = new PageSetup();
		body.setRtlGutter(true);
		try {

			SectionPageSetupResponse result = wordsApi.UpdateSectionPageSetup(name, sectionIndex, storage, folder, filename, body);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of GetDocumentTextItems method, of class WordsApi.
	 */
	@Test
	public void testGetDocumentTextItems() {
		System.out.println("GetDocumentTextItems");
		String name = "test_multi_pages.docx";
		String storage = "";
		String folder = "";
		try {

			TextItemsResponse result = wordsApi.GetDocumentTextItems(name, storage, folder);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}

	/**
	 * Test of PostReplaceText method, of class WordsApi.
	 */
	@Test
	public void testPostReplaceText() {
		System.out.println("PostReplaceText");
		String name = "test_multi_pages.docx";
		String filename = "";
		String storage = "";
		String folder = "";
		ReplaceTextRequest body = new ReplaceTextRequest();
		try {
			
			ReplaceTextResponse result = wordsApi.PostReplaceText(name, filename, storage, folder, body);
			
			
		} catch (ApiException apiException) {
			System.out.println("exp:" + apiException.getMessage());
			assertNull(apiException);
		}
	}
}
