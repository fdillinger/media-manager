<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet 
	version="2.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:dom="http://www.w3.org/2001/xml-events" 
	xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0" 
	xmlns:fla="urn:experimental:fla" 
	xmlns:chart="urn:oasis:names:tc:opendocument:xmlns:chart:1.0" 
	xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0" 
	xmlns:dr3d="urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0" 
	xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0" 
	xmlns:math="http://www.w3.org/1998/Math/MathML" 
	xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0" 
	xmlns:form="urn:oasis:names:tc:opendocument:xmlns:form:1.0" 
	xmlns:table="urn:oasis:names:tc:opendocument:xmlns:table:1.0" 
	xmlns:script="urn:oasis:names:tc:opendocument:xmlns:script:1.0" 
	xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0" 
	xmlns:draw="urn:oasis:names:tc:opendocument:xmlns:drawing:1.0" 
	xmlns:config="urn:oasis:names:tc:opendocument:xmlns:config:1.0" 
	xmlns:xlink="http://www.w3.org/1999/xlink" 
	xmlns:ooo="http://openoffice.org/2004/office" 
	xmlns:dc="http://purl.org/dc/elements/1.1/" 
	xmlns:ooow="http://openoffice.org/2004/writer" 
	xmlns:meta="urn:oasis:names:tc:opendocument:xmlns:meta:1.0" 
	xmlns:oooc="http://openoffice.org/2004/calc" 
	xmlns:w="http://schemas.microsoft.com/office/word/2003/wordml" 
	xmlns:v="urn:schemas-microsoft-com:vml" 
	xmlns:w10="urn:schemas-microsoft-com:office:word" 
	xmlns:sl="http://schemas.microsoft.com/schemaLibrary/2003/core" 
	xmlns:aml="http://schemas.microsoft.com/aml/2001/core" 
	xmlns:wx="http://schemas.microsoft.com/office/word/2003/auxHint" 
	xmlns:o="urn:schemas-microsoft-com:office:office" 
	xmlns:dt="uuid:C2F41010-65B3-11d1-A29F-00AA00C14882" 
	xmlns:wsp="http://schemas.microsoft.com/office/word/2003/wordml/sp2"
	exclude-result-prefixes="o">

    <xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
	
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()"/>
		</xsl:copy>		
	</xsl:template>
	
	<xsl:template match="/">
	
<!--  WORD UPPER PART START-->
<?mso-application progid="Word.Document"?>	
<w:wordDocument xmlns:w="http://schemas.microsoft.com/office/word/2003/wordml"
    xmlns:v="urn:schemas-microsoft-com:vml" xmlns:w10="urn:schemas-microsoft-com:office:word"
    xmlns:sl="http://schemas.microsoft.com/schemaLibrary/2003/core"
    xmlns:aml="http://schemas.microsoft.com/aml/2001/core"
    xmlns:wx="http://schemas.microsoft.com/office/word/2003/auxHint"
    xmlns:o="urn:schemas-microsoft-com:office:office"
    xmlns:dt="uuid:C2F41010-65B3-11d1-A29F-00AA00C14882"
    xmlns:wsp="http://schemas.microsoft.com/office/word/2003/wordml/sp2" w:macrosPresent="no"
    w:embeddedObjPresent="no" w:ocxPresent="no">
    <w:ignoreElements w:val="http://schemas.microsoft.com/office/word/2003/wordml/sp2"/>
    <o:DocumentProperties>
        <o:Author>fdillinger</o:Author>
        <o:LastAuthor>ltrommetter</o:LastAuthor>
        <o:Revision>3</o:Revision>
        <o:TotalTime>0</o:TotalTime>
        <o:Created>2011-03-25T07:21:00Z</o:Created>
        <o:LastSaved>2011-03-25T07:39:00Z</o:LastSaved>
        <o:Pages>1</o:Pages>
        <o:Words>0</o:Words>
        <o:Characters>5</o:Characters>
        <o:Lines>1</o:Lines>
        <o:Paragraphs>1</o:Paragraphs>
        <o:CharactersWithSpaces>5</o:CharactersWithSpaces>
        <o:Version>11.0000</o:Version>
    </o:DocumentProperties>
   
    <w:fonts>
       <w:defaultFonts w:ascii="Times New Roman" w:fareast="Times New Roman" w:h-ansi="Times New Roman" w:cs="Times New Roman"/>
    </w:fonts>
    
    
    <w:styles>
        <w:versionOfBuiltInStylenames w:val="4"/>
             <w:latentStyles w:defLockedState="off" w:latentStyleCount="156"/>
                 <w:style w:type="paragraph" w:default="on" w:styleId="Normal"><w:name w:val="Normal"/><w:pPr><w:jc w:val="both"/></w:pPr><w:rPr><wx:font wx:val="Times New Roman"/><w:sz w:val="24"/><w:sz-cs w:val="24"/><w:lang w:val="EN-GB" w:fareast="EN-GB" w:bidi="AR-SA"/></w:rPr></w:style>
                 <w:style w:type="character" w:default="on" w:styleId="DefaultParagraphFont"><w:name w:val="Default Paragraph Font"/><w:semiHidden/></w:style>
                 <w:style w:type="table" w:default="on" w:styleId="TableNormal"><w:name w:val="Normal Table"/><wx:uiName wx:val="Table Normal"/><w:semiHidden/><w:rPr><wx:font wx:val="Times New Roman"/></w:rPr><w:tblPr><w:tblInd w:w="0" w:type="dxa"/><w:tblCellMar><w:top w:w="0" w:type="dxa"/><w:left w:w="108" w:type="dxa"/><w:bottom w:w="0" w:type="dxa"/><w:right w:w="108" w:type="dxa"/></w:tblCellMar></w:tblPr></w:style>
                 <w:style w:type="list" w:default="on" w:styleId="NoList"><w:name w:val="No List"/><w:semiHidden/></w:style>
                 <w:style w:type="table" w:styleId="TableGrid"><w:name w:val="Table Grid"/><w:basedOn w:val="TableNormal"/><w:rsid w:val="00762090"/><w:pPr><w:jc w:val="both"/></w:pPr><w:rPr><wx:font wx:val="Times New Roman"/></w:rPr><w:tblPr><w:tblInd w:w="0" w:type="dxa"/><w:tblBorders><w:top w:val="single" w:sz="4" wx:bdrwidth="10" w:space="0" w:color="auto"/><w:left w:val="single" w:sz="4" wx:bdrwidth="10" w:space="0" w:color="auto"/><w:bottom w:val="single" w:sz="4" wx:bdrwidth="10" w:space="0" w:color="auto"/><w:right w:val="single" w:sz="4" wx:bdrwidth="10" w:space="0" w:color="auto"/><w:insideH w:val="single" w:sz="4" wx:bdrwidth="10" w:space="0" w:color="auto"/><w:insideV w:val="single" w:sz="4" wx:bdrwidth="10" w:space="0" w:color="auto"/></w:tblBorders><w:tblCellMar><w:top w:w="0" w:type="dxa"/><w:left w:w="108" w:type="dxa"/><w:bottom w:w="0" w:type="dxa"/><w:right w:w="108" w:type="dxa"/></w:tblCellMar></w:tblPr></w:style>
                 <w:style w:type="table" w:styleId="TableGrid8"><w:name w:val="Table Grid 8"/><w:basedOn w:val="TableNormal"/><w:rsid w:val="00762090"/><w:pPr><w:jc w:val="both"/></w:pPr><w:rPr><wx:font wx:val="Times New Roman"/></w:rPr><w:tblPr><w:tblInd w:w="0" w:type="dxa"/><w:tblBorders><w:top w:val="single" w:sz="6" wx:bdrwidth="15" w:space="0" w:color="000080"/><w:left w:val="single" w:sz="6" wx:bdrwidth="15" w:space="0" w:color="000080"/><w:bottom w:val="single" w:sz="6" wx:bdrwidth="15" w:space="0" w:color="000080"/><w:right w:val="single" w:sz="6" wx:bdrwidth="15" w:space="0" w:color="000080"/><w:insideH w:val="single" w:sz="6" wx:bdrwidth="15" w:space="0" w:color="000080"/><w:insideV w:val="single" w:sz="6" wx:bdrwidth="15" w:space="0" w:color="000080"/></w:tblBorders><w:tblCellMar><w:top w:w="0" w:type="dxa"/><w:left w:w="108" w:type="dxa"/><w:bottom w:w="0" w:type="dxa"/><w:right w:w="108" w:type="dxa"/></w:tblCellMar></w:tblPr><w:tcPr><w:shd w:val="clear" w:color="auto" w:fill="auto"/></w:tcPr><w:tblStylePr w:type="firstRow"><w:rPr><w:b/><w:b-cs/><w:color w:val="FFFFFF"/></w:rPr><w:tblPr/><w:tcPr><w:tcBorders><w:tl2br w:val="none" w:sz="0" wx:bdrwidth="0" w:space="0" w:color="auto"/><w:tr2bl w:val="none" w:sz="0" wx:bdrwidth="0" w:space="0" w:color="auto"/></w:tcBorders><w:shd w:val="solid" w:color="000080" w:fill="FFFFFF" wx:bgcolor="000080"/></w:tcPr></w:tblStylePr><w:tblStylePr w:type="lastRow"><w:rPr><w:b/><w:b-cs/><w:color w:val="auto"/></w:rPr><w:tblPr/><w:tcPr><w:tcBorders><w:tl2br w:val="none" w:sz="0" wx:bdrwidth="0" w:space="0" w:color="auto"/><w:tr2bl w:val="none" w:sz="0" wx:bdrwidth="0" w:space="0" w:color="auto"/></w:tcBorders></w:tcPr></w:tblStylePr><w:tblStylePr w:type="lastCol"><w:rPr><w:b/><w:b-cs/><w:color w:val="auto"/></w:rPr><w:tblPr/><w:tcPr><w:tcBorders><w:tl2br w:val="none" w:sz="0" wx:bdrwidth="0" w:space="0" w:color="auto"/><w:tr2bl w:val="none" w:sz="0" wx:bdrwidth="0" w:space="0" w:color="auto"/></w:tcBorders></w:tcPr></w:tblStylePr></w:style>             
     </w:styles>
    
   
    <w:docPr>
        <w:view w:val="print"/>
        <w:zoom w:percent="100"/>
        <w:attachedTemplate w:val=""/>
        <w:defaultTabStop w:val="720"/>
        <w:punctuationKerning/>
        <w:characterSpacingControl w:val="DontCompress"/>
        <w:optimizeForBrowser/>
        <w:targetScreenSz w:val="1024x768"/>
        <w:validateAgainstSchema/>
        <w:saveInvalidXML w:val="off"/>
        <w:ignoreMixedContent w:val="off"/>
        <w:alwaysShowPlaceholderText w:val="off"/>
        <w:compat>
            <w:breakWrappedTables/>
            <w:snapToGridInCell/>
            <w:wrapTextWithPunct/>
            <w:useAsianBreakRules/>
            <w:dontGrowAutofit/>
        </w:compat>
        <wsp:rsids>
            <wsp:rsidRoot wsp:val="00773CC8"/>
            <wsp:rsid wsp:val="00052899"/>
            <wsp:rsid wsp:val="000F62D6"/>
            <wsp:rsid wsp:val="00773CC8"/>
            <wsp:rsid wsp:val="00C12F1F"/>
            <wsp:rsid wsp:val="00E8501D"/>
        </wsp:rsids>
    </w:docPr>
    <w:body>
        <wx:sect>
           		
<!--  WORD UPPER PART END-->	           		

<!-- ******************************************** XSL DYNAMIC PART ***************************************** -->

<!-- < w:body>
      < wx:sect> -->
        <w:tbl>
            <w:tblPr>
                <w:tblStyle w:val="TableGrid8"/>
                <w:tblW w:w="0" w:type="auto"/>
                <w:tblLook w:val="01E0"/>
            </w:tblPr>
            <w:tblGrid>
                <w:gridCol w:w="2000"/>
                <w:gridCol w:w="3000"/>
                <w:gridCol w:w="1200"/>
                <w:gridCol w:w="1200"/>
                <w:gridCol w:w="1200"/>
            </w:tblGrid>
            <!-- ******************************************** HEADER ***************************************** -->
	        <w:tr wsp:rsidR="00762090" wsp:rsidTr="00762090">
	            <w:trPr>
	                <w:cnfStyle w:val="100000000000"/>
	            </w:trPr>
	            <w:tc>
	                <w:tcPr>
	                   <w:tcW w:w="2000" w:type="dxa"/>
	                </w:tcPr>
	                <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
	                  <w:r><w:t>Autor</w:t></w:r>
	                </w:p>
	            </w:tc>
	            <w:tc>
	                <w:tcPr>
	                    <w:tcW w:w="3000" w:type="dxa"/>
	                </w:tcPr>
	                <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
	                   <w:r><w:t>Buchtitel</w:t></w:r>
	                </w:p>
	            </w:tc>
	            <w:tc>
	                <w:tcPr>
	                    <w:tcW w:w="1200" w:type="dxa"/>
	                </w:tcPr>
	                <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
	                   <w:r><w:t>Lektor</w:t></w:r>
	                </w:p>
	            </w:tc>
	            <w:tc>
	                <w:tcPr><w:tcW w:w="1200" w:type="dxa"/></w:tcPr>
	                <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
	                   <w:r><w:t>Genre</w:t></w:r>
	                </w:p>
	            </w:tc>
	            <w:tc>
	               <w:tcPr><w:cnfStyle w:val="000100000000"/><w:tcW w:w="1705" w:type="dxa"/></w:tcPr>
	               <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
	                 <w:r><w:t>Bewertung</w:t></w:r>
	               </w:p>
	            </w:tc>
	        </w:tr>
	        
	        <!-- ******************************************** Inhalt ***************************************** -->
	        <xsl:for-each select="list/author">
		        <xsl:variable name="lastname" select="lastname"/>
		        <xsl:variable name="firstname" select="firstname"/>
		        <xsl:for-each select="books/book">
		        <w:tr wsp:rsidR="00762090" wsp:rsidTr="00762090">
		           <w:trPr><w:cnfStyle w:val="010000000000"/></w:trPr>
		           <w:tc>
		              <w:tcPr><w:tcW w:w="2000" w:type="dxa"/></w:tcPr>
		              <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
		                 <w:r><w:t>
		                      <xsl:value-of select="$lastname"/>
		                      <xsl:text>, </xsl:text>
		                      <xsl:value-of select="$firstname"/>
		                 </w:t></w:r>
		              </w:p>
		           </w:tc>
		           <w:tc>
		               <w:tcPr><w:tcW w:w="3000" w:type="dxa"/></w:tcPr>
		               <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
		                  <w:r><w:t><xsl:value-of select="title"/></w:t></w:r>
		               </w:p>
		            </w:tc>
		            <w:tc>
		               <w:tcPr><w:tcW w:w="1200" w:type="dxa"/></w:tcPr>
		               <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
		                  <w:r><w:t></w:t></w:r>
		               </w:p>
		             </w:tc>
		             <w:tc>
		                <w:tcPr><w:tcW w:w="1200" w:type="dxa"/></w:tcPr>
		                <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
		                   <w:r><w:t></w:t></w:r>
		                </w:p>
		              </w:tc>
		              <w:tc>
		                 <w:tcPr><w:cnfStyle w:val="000100000000"/><w:tcW w:w="1705" w:type="dxa"/></w:tcPr>
		                 <w:p wsp:rsidR="00762090" wsp:rsidRDefault="00762090" wsp:rsidP="00762090">
		                   <w:r><w:t></w:t></w:r>
		                 </w:p>
		               </w:tc>
		         </w:tr>
		        </xsl:for-each>
		        
	        </xsl:for-each>	
	   </w:tbl>
	   
<!--	   
	   < w:p wsp:rsidR="00F63F79" wsp:rsidRPr="00762090" wsp:rsidRDefault="00F63F79" wsp:rsidP="00762090"/>
	   < w:sectPr wsp:rsidR="00F63F79" wsp:rsidRPr="00762090"><w:pgSz w:w="11906" w:h="16838"/><w:pgMar w:top="1440" w:right="1800" w:bottom="1440" w:left="1800" w:header="708" w:footer="708" w:gutter="0"/><w:cols w:space="708"/><w:docGrid w:line-pitch="360"/>
	   < /w:sectPr></wx:sect></w:body>

 <w:p wsp:rsidR="000F62D6" wsp:rsidRDefault="00052899"> 
	 <w:pPr>
	     <w:jc w:val="left"/>
	     <w:rPr>
	         <w:rFonts w:ascii="Arial" w:h-ansi="Arial" w:cs="Arial"/>
	         <wx:font wx:val="Arial"/>
	         <w:sz w:val="20"/>
	         <w:sz-cs w:val="20"/>
	     </w:rPr>
	 </w:pPr>		
	<xsl:for-each select="list/author">
		<w:r>
			<w:t>
			    <xsl:value-of select="lastname"/>
			    <xsl:text> </xsl:text>
			    <xsl:value-of select="firstname"/>
				<w:br w:type="text-wrapping"/>	
				<xsl:for-each select="books/book">
					<xsl:text> </xsl:text><xsl:value-of select="title"/><xsl:text> </xsl:text><w:br w:type="text-wrapping"/>
				</xsl:for-each>		
				<w:br w:type="text-wrapping"/>
			</w:t>	
			<w:br w:type="text-wrapping"/>	
		</w:r>	
	</xsl:for-each>	
</w:p>    
-->
<!-- ******************************************** XSL DYNAMIC PART ***************************************** -->		

<!--  WORD LOWER PART START-->
      
            <w:sectPr wsp:rsidR="00052899" wsp:rsidSect="00E8501D">
                <w:pgSz w:w="11906" w:h="16838"/>
                <w:pgMar w:top="1440" w:right="1800" w:bottom="1440" w:left="1800" w:header="708"
                    w:footer="708" w:gutter="0"/>
                <w:cols w:space="708"/>
                <w:docGrid w:line-pitch="360"/>
            </w:sectPr>
        </wx:sect>
    </w:body>
</w:wordDocument>

<!--  WORD LOWER PART START-->	
	

	</xsl:template>	
	


</xsl:stylesheet>
