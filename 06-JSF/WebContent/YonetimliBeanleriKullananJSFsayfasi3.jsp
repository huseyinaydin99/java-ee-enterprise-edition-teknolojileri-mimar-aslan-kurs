<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Managed Bean 3</title>
</head>
<body>
<f:view>
    <h3>Managed Bean 3</h3>
    <h:form>
        <h:panelGrid id="panel" columns="2" border="0">
            <f:facet name="header">
                <h:outputText value="Login"/>
            </f:facet>
            <h:outputText value="Adı : "/> <h:inputText value="#{yonetimliBean3.adi}"/>
            <h:outputText value="Soyadı : "/> <h:inputText value="#{yonetimliBean3.soyadi}"/>
            <h:outputText value="Deneyim"/>
            <h:selectOneRadio layout="pageDirection" value="#{yonetimliBean3.deneyim}">
                <f:selectItem itemValue="JSP" itemLabel="JavaServer Pages"/>
                <f:selectItem itemValue="JSF" itemLabel="JavaServer Faces"/>
                <f:selectItem itemValue="Spring" itemLabel="Spring"/>
                <f:selectItem itemValue="Hibernate" itemLabel="Hibernate"/>
                <f:selectItem itemValue="RESTful" itemLabel="RESTful"/>
            </h:selectOneRadio>
            <h:commandButton value="Temizle" type="reset"/>
            <h:commandButton value="Gönder" action="#{yonetimliBean3.yazdirMetodu}"/>
            <f:facet name="footer">
                <h:outputText value="Bilgileriniz."/>
            </f:facet>
        </h:panelGrid>
        <hr/>
        <h:outputText value="Ad Soyad :"/>
        <h:outputLabel value="#{yonetimliBean3.adi} #{yonetimliBean3.soyadi} "/>
        <br/>
        <h:outputText value="Deneyim :"/>
        <h:outputLabel value="#{yonetimliBean3.deneyim}"/>
    </h:form>
</f:view>
</body>
</html>