
package com.grumpy.product.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/{productId}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #customattributes()}</li>
 * <li>{@link #media()}</li>
 * </ul>
 * 
 */
public class TenantProductsProductIdBuilder
    extends AbstractResourceBuilder<TenantProductsProductIdBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/{productId}";
    /**
     * The static field for the <code>productId</code> URI parameter name.
     * 
     */
    protected final static String URI_PARAM_PRODUCT_ID = "productId";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_PRODUCT_ID };

    /**
     * Creates a new instance of the {@link TenantProductsProductIdBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantProductsProductIdBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantProductsProductIdBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantProductsProductIdBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantProductsProductIdBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>productId</code> URI parameter of this resource.
     * 
     * @param productId the new value for the <code>productId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdBuilder fillProductId(final String productId) {
        return this.withUriParam(TenantProductsProductIdBuilder.URI_PARAM_PRODUCT_ID, productId);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantProductsBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/customattributes</code>.
     * 
     * @return an instance of {@link TenantProductsProductIdCustomattributesBuilder}
     * 
     */
    public TenantProductsProductIdCustomattributesBuilder customattributes() {
        return new TenantProductsProductIdCustomattributesBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/media</code>.
     * 
     * @return an instance of {@link TenantProductsProductIdMediaBuilder}
     * 
     */
    public TenantProductsProductIdMediaBuilder media() {
        return new TenantProductsProductIdMediaBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantProductsProductIdBuilder.GetActionBuilder prepareGet() {
        return new TenantProductsProductIdBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantProductsProductIdBuilder.PutActionBuilder preparePut() {
        return new TenantProductsProductIdBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantProductsProductIdBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantProductsProductIdBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantProductsProductIdBuilder.AnyActionBuilder prepareAny() {
        return new TenantProductsProductIdBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantProductsProductIdBuilder.ArbitraryActionBuilder<TenantProductsProductIdBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsProductIdBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantProductsProductIdBuilder.AnyActionBuilder>
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
        protected TenantProductsProductIdBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdBuilder.AnyActionBuilder actionBuilder = new TenantProductsProductIdBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsProductIdBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantProductsProductIdBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantProductsProductIdBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantProductsProductIdBuilder.ArbitraryActionBuilder<?> >
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
         * Fill the <code>productId</code> URI parameter of this resource.
         * 
         * @param productId the new value for the <code>productId</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillProductId(final String productId) {
            return this.withUriParam(TenantProductsProductIdBuilder.URI_PARAM_PRODUCT_ID, productId);
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
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TenantProductsProductIdBuilder.ArbitraryActionBuilder<TenantProductsProductIdBuilder.DeleteActionBuilder>
    {


        /**
         * Creates a new instance of a {@link DeleteActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public DeleteActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod.DELETE);
        }

        @Override
        protected TenantProductsProductIdBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdBuilder.DeleteActionBuilder actionBuilder = new TenantProductsProductIdBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProductsProductIdBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantProductsProductIdBuilder.ArbitraryActionBuilder<TenantProductsProductIdBuilder.GetActionBuilder>
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
        protected TenantProductsProductIdBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdBuilder.GetActionBuilder actionBuilder = new TenantProductsProductIdBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantProductsProductIdBuilder.GetActionBuilder withAcceptLanguage(String acceptLanguage) {
            return this.withRepeatableHeader("Accept-Language", acceptLanguage);
        }

        /**
         * Appends a new header value to the <code>hybris-languages</code> multiple header.
         * 
         * @param hybrisLanguages the new value of the <code>hybris-languages</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>hybris-languages</code> header value added
         * 
         */
        public TenantProductsProductIdBuilder.GetActionBuilder withHybrisLanguages(String hybrisLanguages) {
            return this.withRepeatableHeader("hybris-languages", hybrisLanguages);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProductsProductIdBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>expand</code> query parameter value.
         * 
         * @param expand the value of the <code>expand</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>expand</code> query parameter set
         * 
         */
        public TenantProductsProductIdBuilder.GetActionBuilder withExpand(String expand) {
            return this.withSingleQuery("expand", expand);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantProductsProductIdBuilder.ArbitraryActionBuilder<TenantProductsProductIdBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsProductIdBuilder.PutActionBuilder, Object>
    {


        /**
         * Creates a new instance of a {@link PutActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public PutActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod.PUT);
        }

        @Override
        protected TenantProductsProductIdBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdBuilder.PutActionBuilder actionBuilder = new TenantProductsProductIdBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsProductIdBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Content-Language</code> header value.
         * 
         * @param contentLanguage the value of the <code>Content-Language</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Content-Language</code> header set
         * 
         */
        public TenantProductsProductIdBuilder.PutActionBuilder withContentLanguage(String contentLanguage) {
            return this.withSingleHeader("Content-Language", contentLanguage);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProductsProductIdBuilder.PutActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>partial</code> query parameter value.
         * 
         * @param partial the value of the <code>partial</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>partial</code> query parameter set
         * 
         */
        public TenantProductsProductIdBuilder.PutActionBuilder withPartial(Boolean partial) {
            return this.withSingleQuery("partial", partial);
        }

    }

}
