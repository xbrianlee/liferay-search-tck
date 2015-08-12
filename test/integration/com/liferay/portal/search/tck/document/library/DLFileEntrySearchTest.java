package com.liferay.portal.search.tck.document.library;

import org.arquillian.liferay.deploymentscenario.annotations.BndFile;

import com.liferay.portal.search.tck.bnd.BndConstants;

@BndFile(
		BndConstants.BASE_DIR 
		+ "/com/liferay/portal/search/tck/document/library"
		+ "/bnd.bnd")
public class DLFileEntrySearchTest 
	extends com.liferay.document.library.search.test.DLFileEntrySearchTest {

}