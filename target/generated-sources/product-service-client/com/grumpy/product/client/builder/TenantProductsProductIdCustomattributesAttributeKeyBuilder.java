
package com.grumpy.product.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/{attributeKey}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantProductsProductIdCustomattributesAttributeKeyBuilder
    extends AbstractResourceBuilder<TenantProductsProductIdCustomattributesAttributeKeyBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/{attributeKey}";
    /**
     * The static field for the <code>attributeKey</code> URI parameter name.
     * 
     */
    protected final static String URI_PARAM_ATTRIBUTE_KEY = "attributeKey";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_ATTRIBUTE_KEY };

    /**
     * Creates a new instance of the {@link TenantProductsProductIdCustomattributesAttributeKeyBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantProductsProductIdCustomattributesAttributeKeyBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantProductsProductIdCustomattributesAttributeKeyBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantProductsProductIdCustomattributesAttributeKeyBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantProductsProductIdCustomattributesAttributeKeyBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>attributeKey</code> URI parameter of this resource.
     * 
     * @param attributeKey the new value for the <code>attributeKey</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdCustomattributesAttributeKeyBuilder fillAttributeKey(final String attributeKey) {
        return this.withUriParam(TenantProductsProductIdCustomattributesAttributeKeyBuilder.URI_PARAM_ATTRIBUTE_KEY, attributeKey);
    }

    /**
     * Fill the <code>productId</code> URI parameter of this resource.
     * 
     * @param productId the new value for the <code>productId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdCustomattributesAttributeKeyBuilder fillProductId(final String productId) {
        return this.withUriParam(TenantProductsProductIdBuilder.URI_PARAM_PRODUCT_ID, productId);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdCustomattributesAttributeKeyBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantProductsBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder preparePut() {
        return new TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantProductsProductIdCustomattributesAttributeKeyBuilder.GetActionBuilder prepareGet() {
        return new TenantProductsProductIdCustomattributesAttributeKeyBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantProductsProductIdCustomattributesAttributeKeyBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantProductsProductIdCustomattributesAttributeKeyBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder prepareAny() {
        return new TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantProductsProductIdCustomattributesAttributeKeyBuilder.ArbitraryActionBuilder<TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder>
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
        protected TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder actionBuilder = new TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantProductsProductIdCustomattributesAttributeKeyBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantProductsProductIdCustomattributesAttributeKeyBuilder.ArbitraryActionBuilder<?> >
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
         * Fill the <code>attributeKey</code> URI parameter of this resource.
         * 
         * @param attributeKey the new value for the <code>attributeKey</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillAttributeKey(final String attributeKey) {
            return this.withUriParam(TenantProductsProductIdCustomattributesAttributeKeyBuilder.URI_PARAM_ATTRIBUTE_KEY, attributeKey);
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
        extends TenantProductsProductIdCustomattributesAttributeKeyBuilder.ArbitraryActionBuilder<TenantProductsProductIdCustomattributesAttributeKeyBuilder.DeleteActionBuilder>
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
        protected TenantProductsProductIdCustomattributesAttributeKeyBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdCustomattributesAttributeKeyBuilder.DeleteActionBuilder actionBuilder = new TenantProductsProductIdCustomattributesAttributeKeyBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
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
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantProductsProductIdCustomattributesAttributeKeyBuilder.ArbitraryActionBuilder<TenantProductsProductIdCustomattributesAttributeKeyBuilder.GetActionBuilder>
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
        protected TenantProductsProductIdCustomattributesAttributeKeyBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdCustomattributesAttributeKeyBuilder.GetActionBuilder actionBuilder = new TenantProductsProductIdCustomattributesAttributeKeyBuilder.GetActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantProductsProductIdCustomattributesAttributeKeyBuilder.ArbitraryActionBuilder<TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder, Object>
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
        protected TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder actionBuilder = new TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProductsProductIdCustomattributesAttributeKeyBuilder.PutActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }

}
