// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       A service to return Ads Campaign Management data matching a {@link Selector}.
 *       <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DataServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DataServiceInterface {


    /**
     * 
     *         Returns a list of {@link AdGroupBidLandscape}s for the ad groups specified in the selector.
     *         In the result, the returned {@link LandscapePoint}s are grouped into
     *         {@link AdGroupBidLandscape}s by their ad groups, and numberResults of paging limits the total
     *         number of {@link LandscapePoint}s instead of number of {@link AdGroupBidLandscape}s.
     *         
     *         @param serviceSelector Selects the entities to return bid landscapes for.
     *         @return A list of bid landscapes.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.cm.AdGroupBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
    @RequestWrapper(localName = "getAdGroupBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacegetAdGroupBidLandscape")
    @ResponseWrapper(localName = "getAdGroupBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacegetAdGroupBidLandscapeResponse")
    public AdGroupBidLandscapePage getAdGroupBidLandscape(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of {@link CriterionBidLandscape}s for the campaign criteria specified in the
     *         selector. In the result, the returned {@link LandscapePoint}s are grouped into
     *         {@link CriterionBidLandscape}s by their campaign id and criterion id, and numberResults
     *         of paging limits the total number of {@link LandscapePoint}s instead of number of
     *         {@link CriterionBidLandscape}s.
     *         
     *         @param serviceSelector Selects the entities to return bid landscapes for.
     *         @return A list of bid landscapes.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.cm.CriterionBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
    @RequestWrapper(localName = "getCampaignCriterionBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacegetCampaignCriterionBidLandscape")
    @ResponseWrapper(localName = "getCampaignCriterionBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacegetCampaignCriterionBidLandscapeResponse")
    public CriterionBidLandscapePage getCampaignCriterionBidLandscape(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of {@link CriterionBidLandscape}s for the criteria specified in the selector.
     *         In the result, the returned {@link LandscapePoint}s are grouped into
     *         {@link CriterionBidLandscape}s by their criteria, and numberResults of paging limits the total
     *         number of {@link LandscapePoint}s instead of number of {@link CriterionBidLandscape}s.
     *         
     *         @param serviceSelector Selects the entities to return bid landscapes for.
     *         @return A list of bid landscapes.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.cm.CriterionBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
    @RequestWrapper(localName = "getCriterionBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacegetCriterionBidLandscape")
    @ResponseWrapper(localName = "getCriterionBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacegetCriterionBidLandscapeResponse")
    public CriterionBidLandscapePage getCriterionBidLandscape(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of domain categories that can be used to create {@link WebPage} criterion.
     *         
     *         @param serviceSelector Selects the entities to return domain categories for.
     *         @return A list of domain categories.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.cm.DomainCategoryPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
    @RequestWrapper(localName = "getDomainCategory", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacegetDomainCategory")
    @ResponseWrapper(localName = "getDomainCategoryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacegetDomainCategoryResponse")
    public DomainCategoryPage getDomainCategory(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of {@link AdGroupBidLandscape}s for the ad groups that match the query. In the
     *         result, the returned {@link LandscapePoint}s are grouped into {@link AdGroupBidLandscape}s
     *         by their ad groups, and numberResults of paging limits the total number of
     *         {@link LandscapePoint}s instead of number of {@link AdGroupBidLandscape}s.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of bid landscapes.
     *         @throws ApiException if problems occur while parsing the query or fetching bid landscapes.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.cm.AdGroupBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
    @RequestWrapper(localName = "queryAdGroupBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacequeryAdGroupBidLandscape")
    @ResponseWrapper(localName = "queryAdGroupBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacequeryAdGroupBidLandscapeResponse")
    public AdGroupBidLandscapePage queryAdGroupBidLandscape(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
        String query)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of {@link CriterionBidLandscape}s for the campaign criteria that match the
     *         query. In the result, the returned {@link LandscapePoint}s are grouped into
     *         {@link CriterionBidLandscape}s by their campaign id and criterion id, and numberResults
     *         of paging limits the total number of {@link LandscapePoint}s instead of number of
     *         {@link CriterionBidLandscape}s.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of bid landscapes.
     *         @throws ApiException if problems occur while parsing the query or fetching bid landscapes.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.cm.CriterionBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
    @RequestWrapper(localName = "queryCampaignCriterionBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacequeryCampaignCriterionBidLandscape")
    @ResponseWrapper(localName = "queryCampaignCriterionBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacequeryCampaignCriterionBidLandscapeResponse")
    public CriterionBidLandscapePage queryCampaignCriterionBidLandscape(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
        String query)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of {@link CriterionBidLandscape}s for the criteria that match the query. In the
     *         result, the returned {@link LandscapePoint}s are grouped into {@link CriterionBidLandscape}s
     *         by their criteria, and numberResults of paging limits the total number of
     *         {@link LandscapePoint}s instead of number of {@link CriterionBidLandscape}s.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of bid landscapes.
     *         @throws ApiException if problems occur while parsing the query or fetching bid landscapes.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.cm.CriterionBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
    @RequestWrapper(localName = "queryCriterionBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacequeryCriterionBidLandscape")
    @ResponseWrapper(localName = "queryCriterionBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacequeryCriterionBidLandscapeResponse")
    public CriterionBidLandscapePage queryCriterionBidLandscape(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
        String query)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of domain categories that can be used to create {@link WebPage} criterion.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of domain categories.
     *         @throws ApiException if problems occur while parsing the query
     *         or fetching domain categories.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.cm.DomainCategoryPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
    @RequestWrapper(localName = "queryDomainCategory", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacequeryDomainCategory")
    @ResponseWrapper(localName = "queryDomainCategoryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.DataServiceInterfacequeryDomainCategoryResponse")
    public DomainCategoryPage queryDomainCategory(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
        String query)
        throws ApiException_Exception
    ;

}
