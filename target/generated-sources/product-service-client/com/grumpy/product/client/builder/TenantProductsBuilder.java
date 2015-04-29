
package com.grumpy.product.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/{tenant}/products</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #productId()}</li>
 * </ul>
 * 
 */
public class TenantProductsBuilder
    extends AbstractResourceBuilder<TenantProductsBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/{tenant}/products";
    /**
     * The static field for the <code>tenant</code> URI parameter name.
     * 
     */
    protected final static String URI_PARAM_TENANT = "tenant";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_TENANT };

    /**
     * Creates a new instance of the {@link TenantProductsBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantProductsBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantProductsBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantProductsBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantProductsBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantProductsBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{productId}</code>.
     * 
     * @return an instance of {@link TenantProductsProductIdBuilder}
     * 
     */
    public TenantProductsProductIdBuilder productId() {
        return new TenantProductsProductIdBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{productId}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #productId()} method instead.
     * 
     * @return an instance of {@link TenantProductsProductIdBuilder}
     * @param productId the value of the <code>productId</code> URI parameter
     * 
     */
    public TenantProductsProductIdBuilder productId(String productId) {
        TenantProductsProductIdBuilder resourceBuilder = new TenantProductsProductIdBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillProductId(productId);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantProductsBuilder.GetActionBuilder prepareGet() {
        return new TenantProductsBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantProductsBuilder.PostActionBuilder preparePost() {
        return new TenantProductsBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantProductsBuilder.AnyActionBuilder prepareAny() {
        return new TenantProductsBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantProductsBuilder.ArbitraryActionBuilder<TenantProductsBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantProductsBuilder.AnyActionBuilder>
    {


        /**
         * Creates a new instance of a {@link AnyActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public AnyActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        @Override
        protected TenantProductsBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsBuilder.AnyActionBuilder actionBuilder = new TenantProductsBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantProductsBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantProductsBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
            actionBuilder.setHttpMethod(theMethod);
            return actionBuilder;
        }

    }


    /**
     * Base abstract class for all {@link com.hybris.ramler.commons.builder.ActionBuilder}s for this resource.
     * 
     * @param <T> the type of the builder which will be produced by the builder methods
     * 
     */
    public static abstract class ArbitraryActionBuilder<T extends TenantProductsBuilder.ArbitraryActionBuilder<?> >
        extends AbstractActionBuilder<T>
    {


        /**
         * Creates a new instance of the {@link ArbitraryActionBuilder}, for given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget instance
         * @param requestParams the given RequestParams instance
         * 
         */
        public ArbitraryActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantProductsBuilder.URI_PARAM_TENANT, tenant);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantProductsBuilder.ArbitraryActionBuilder<TenantProductsBuilder.GetActionBuilder>
    {


        /**
         * Creates a new instance of a {@link GetActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public GetActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod.GET);
        }

        @Override
        protected TenantProductsBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsBuilder.GetActionBuilder actionBuilder = new TenantProductsBuilder.GetActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Appends a new header value to the <code>Accept-Language</code> multiple header.
         * 
         * @param acceptLanguage the new value of the <code>Accept-Language</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Accept-Language</code> header value added
         * 
         */
        public TenantProductsBuilder.GetActionBuilder withAcceptLanguage(String acceptLanguage) {
            return this.withRepeatableHeader("Accept-Language", acceptLanguage);
        }

        /**
         * Appends a new header value to the <code>hybris-languages</code> multiple header.
         * 
         * @param hybrisLanguages the new value of the <code>hybris-languages</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>hybris-languages</code> header value added
         * 
         */
        public TenantProductsBuilder.GetActionBuilder withHybrisLanguages(String hybrisLanguages) {
            return this.withRepeatableHeader("hybris-languages", hybrisLanguages);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProductsBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>expand</code> query parameter value.
         * 
         * @param expand the value of the <code>expand</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>expand</code> query parameter set
         * 
         */
        public TenantProductsBuilder.GetActionBuilder withExpand(String expand) {
            return this.withSingleQuery("expand", expand);
        }

        /**
         * Sets the <code>pageNumber</code> query parameter value.
         * 
         * @param pageNumber the value of the <code>pageNumber</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>pageNumber</code> query parameter set
         * 
         */
        public TenantProductsBuilder.GetActionBuilder withPageNumber(Integer pageNumber) {
            return this.withSingleQuery("pageNumber", pageNumber);
        }

        /**
         * Sets the <code>pageSize</code> query parameter value.
         * 
         * @param pageSize the value of the <code>pageSize</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>pageSize</code> query parameter set
         * 
         */
        public TenantProductsBuilder.GetActionBuilder withPageSize(Integer pageSize) {
            return this.withSingleQuery("pageSize", pageSize);
        }

        /**
         * Sets the <code>sort</code> query parameter value.
         * 
         * @param sort the value of the <code>sort</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>sort</code> query parameter set
         * 
         */
        public TenantProductsBuilder.GetActionBuilder withSort(String sort) {
            return this.withSingleQuery("sort", sort);
        }

        /**
         * Sets the <code>q</code> query parameter value.
         * 
         * @param q the value of the <code>q</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>q</code> query parameter set
         * 
         */
        public TenantProductsBuilder.GetActionBuilder withQ(String q) {
            return this.withSingleQuery("q", q);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantProductsBuilder.ArbitraryActionBuilder<TenantProductsBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsBuilder.PostActionBuilder, Object>
    {


        /**
         * Creates a new instance of a {@link PostActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public PostActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod.POST);
        }

        @Override
        protected TenantProductsBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsBuilder.PostActionBuilder actionBuilder = new TenantProductsBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Content-Language</code> header value.
         * 
         * @param contentLanguage the value of the <code>Content-Language</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Content-Language</code> header set
         * 
         */
        public TenantProductsBuilder.PostActionBuilder withContentLanguage(String contentLanguage) {
            return this.withSingleHeader("Content-Language", contentLanguage);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProductsBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }

}
