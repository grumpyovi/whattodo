
package com.grumpy.product.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/{mediaId}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #content()}</li>
 * </ul>
 * 
 */
public class TenantProductsProductIdMediaMediaIdBuilder
    extends AbstractResourceBuilder<TenantProductsProductIdMediaMediaIdBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/{mediaId}";
    /**
     * The static field for the <code>mediaId</code> URI parameter name.
     * 
     */
    protected final static String URI_PARAM_MEDIA_ID = "mediaId";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_MEDIA_ID };

    /**
     * Creates a new instance of the {@link TenantProductsProductIdMediaMediaIdBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantProductsProductIdMediaMediaIdBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantProductsProductIdMediaMediaIdBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantProductsProductIdMediaMediaIdBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>mediaId</code> URI parameter of this resource.
     * 
     * @param mediaId the new value for the <code>mediaId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder fillMediaId(final String mediaId) {
        return this.withUriParam(TenantProductsProductIdMediaMediaIdBuilder.URI_PARAM_MEDIA_ID, mediaId);
    }

    /**
     * Fill the <code>productId</code> URI parameter of this resource.
     * 
     * @param productId the new value for the <code>productId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder fillProductId(final String productId) {
        return this.withUriParam(TenantProductsProductIdBuilder.URI_PARAM_PRODUCT_ID, productId);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantProductsBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/content</code>.
     * 
     * @return an instance of {@link TenantProductsProductIdMediaMediaIdContentBuilder}
     * 
     */
    public TenantProductsProductIdMediaMediaIdContentBuilder content() {
        return new TenantProductsProductIdMediaMediaIdContentBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder.GetActionBuilder prepareGet() {
        return new TenantProductsProductIdMediaMediaIdBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder preparePut() {
        return new TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantProductsProductIdMediaMediaIdBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder prepareAny() {
        return new TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantProductsProductIdMediaMediaIdBuilder.ArbitraryActionBuilder<TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder>
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
        protected TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder actionBuilder = new TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantProductsProductIdMediaMediaIdBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantProductsProductIdMediaMediaIdBuilder.ArbitraryActionBuilder<?> >
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
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TenantProductsProductIdMediaMediaIdBuilder.ArbitraryActionBuilder<TenantProductsProductIdMediaMediaIdBuilder.DeleteActionBuilder>
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
        protected TenantProductsProductIdMediaMediaIdBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdMediaMediaIdBuilder.DeleteActionBuilder actionBuilder = new TenantProductsProductIdMediaMediaIdBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
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
        public TenantProductsProductIdMediaMediaIdBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantProductsProductIdMediaMediaIdBuilder.ArbitraryActionBuilder<TenantProductsProductIdMediaMediaIdBuilder.GetActionBuilder>
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
        protected TenantProductsProductIdMediaMediaIdBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdMediaMediaIdBuilder.GetActionBuilder actionBuilder = new TenantProductsProductIdMediaMediaIdBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantProductsProductIdMediaMediaIdBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantProductsProductIdMediaMediaIdBuilder.ArbitraryActionBuilder<TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder, Object>
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
        protected TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder actionBuilder = new TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>partial</code> query parameter value.
         * 
         * @param partial the value of the <code>partial</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>partial</code> query parameter set
         * 
         */
        public TenantProductsProductIdMediaMediaIdBuilder.PutActionBuilder withPartial(Boolean partial) {
            return this.withSingleQuery("partial", partial);
        }

    }

}
