
package com.grumpy.product.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/media</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #mediaId()}</li>
 * </ul>
 * 
 */
public class TenantProductsProductIdMediaBuilder
    extends AbstractResourceBuilder<TenantProductsProductIdMediaBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/media";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link TenantProductsProductIdMediaBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantProductsProductIdMediaBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantProductsProductIdMediaBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantProductsProductIdMediaBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantProductsProductIdMediaBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>productId</code> URI parameter of this resource.
     * 
     * @param productId the new value for the <code>productId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdMediaBuilder fillProductId(final String productId) {
        return this.withUriParam(TenantProductsProductIdBuilder.URI_PARAM_PRODUCT_ID, productId);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProductsProductIdMediaBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantProductsBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{mediaId}</code>.
     * 
     * @return an instance of {@link TenantProductsProductIdMediaMediaIdBuilder}
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder mediaId() {
        return new TenantProductsProductIdMediaMediaIdBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{mediaId}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #mediaId()} method instead.
     * 
     * @return an instance of {@link TenantProductsProductIdMediaMediaIdBuilder}
     * @param mediaId the value of the <code>mediaId</code> URI parameter
     * 
     */
    public TenantProductsProductIdMediaMediaIdBuilder mediaId(String mediaId) {
        TenantProductsProductIdMediaMediaIdBuilder resourceBuilder = new TenantProductsProductIdMediaMediaIdBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillMediaId(mediaId);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantProductsProductIdMediaBuilder.PostActionBuilder preparePost() {
        return new TenantProductsProductIdMediaBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantProductsProductIdMediaBuilder.GetActionBuilder prepareGet() {
        return new TenantProductsProductIdMediaBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantProductsProductIdMediaBuilder.AnyActionBuilder prepareAny() {
        return new TenantProductsProductIdMediaBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantProductsProductIdMediaBuilder.ArbitraryActionBuilder<TenantProductsProductIdMediaBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsProductIdMediaBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantProductsProductIdMediaBuilder.AnyActionBuilder>
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
        protected TenantProductsProductIdMediaBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdMediaBuilder.AnyActionBuilder actionBuilder = new TenantProductsProductIdMediaBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsProductIdMediaBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantProductsProductIdMediaBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantProductsProductIdMediaBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantProductsProductIdMediaBuilder.ArbitraryActionBuilder<?> >
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
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantProductsProductIdMediaBuilder.ArbitraryActionBuilder<TenantProductsProductIdMediaBuilder.GetActionBuilder>
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
        protected TenantProductsProductIdMediaBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdMediaBuilder.GetActionBuilder actionBuilder = new TenantProductsProductIdMediaBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantProductsProductIdMediaBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantProductsProductIdMediaBuilder.ArbitraryActionBuilder<TenantProductsProductIdMediaBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantProductsProductIdMediaBuilder.PostActionBuilder, Object>
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
        protected TenantProductsProductIdMediaBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProductsProductIdMediaBuilder.PostActionBuilder actionBuilder = new TenantProductsProductIdMediaBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProductsProductIdMediaBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProductsProductIdMediaBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProductsProductIdMediaBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }

}
