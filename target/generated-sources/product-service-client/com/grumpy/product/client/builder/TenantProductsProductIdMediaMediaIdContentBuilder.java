
package com.grumpy.product.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/content</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantProductsProductIdMediaMediaIdContentBuilder
    extends AbstractResourceBuilder<TenantProductsProductIdMediaMediaIdContentBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/content";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link TenantProductsProductIdMediaMediaIdContentBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantProductsProductIdMediaMediaIdContentBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantProductsProductIdMediaMediaIdContentBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantProductsProductIdMediaMediaIdContentBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantProductsProductIdMediaMediaIdContentBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>mediaId</code> URI parameter of this resource.
     * 
     * @param mediaId the new value for the <code>mediaId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdMediaMediaIdContentBuilder fillMediaId(final String mediaId) {
        return this.withUriParam(TenantProductsProductIdMediaMediaIdBuilder.URI_PARAM_MEDIA_ID, mediaId);
    }

    /**
     * Fill the <code>productId</code> URI parameter of this resource.
     * 
     * @param productId the new value for the <code>productId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdMediaMediaIdContentBuilder fillProductId(final String productId) {
        return this.withUriParam(TenantProductsProductIdBuilder.URI_PARAM_PRODUCT_ID, productId);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdMediaMediaIdContentBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantProductsBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantProductsProductIdMediaMediaIdContentBuilder.GetActionBuilder prepareGet() {
        return new TenantProductsProductIdMediaMediaIdContentBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder prepareAny() {
        return new TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantProductsProductIdMediaMediaIdContentBuilder.ArbitraryActionBuilder<TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder>
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
        protected TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder actionBuilder = new TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantProductsProductIdMediaMediaIdContentBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantProductsProductIdMediaMediaIdContentBuilder.ArbitraryActionBuilder<?> >
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
         * Fill the <code>mediaId</code> URI parameter of this resource.
         * 
         * @param mediaId the new value for the <code>mediaId</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillMediaId(final String mediaId) {
            return this.withUriParam(TenantProductsProductIdMediaMediaIdBuilder.URI_PARAM_MEDIA_ID, mediaId);
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
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantProductsProductIdMediaMediaIdContentBuilder.ArbitraryActionBuilder<TenantProductsProductIdMediaMediaIdContentBuilder.GetActionBuilder>
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
        protected TenantProductsProductIdMediaMediaIdContentBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdMediaMediaIdContentBuilder.GetActionBuilder actionBuilder = new TenantProductsProductIdMediaMediaIdContentBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantProductsProductIdMediaMediaIdContentBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }

}
