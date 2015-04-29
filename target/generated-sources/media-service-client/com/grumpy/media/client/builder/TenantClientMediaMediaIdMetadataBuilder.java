
package com.grumpy.media.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/metadata</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantClientMediaMediaIdMetadataBuilder
    extends AbstractResourceBuilder<TenantClientMediaMediaIdMetadataBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/metadata";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link TenantClientMediaMediaIdMetadataBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientMediaMediaIdMetadataBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientMediaMediaIdMetadataBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientMediaMediaIdMetadataBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientMediaMediaIdMetadataBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>mediaId</code> URI parameter of this resource.
     * 
     * @param mediaId the new value for the <code>mediaId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientMediaMediaIdMetadataBuilder fillMediaId(final String mediaId) {
        return this.withUriParam(TenantClientMediaMediaIdBuilder.URI_PARAM_MEDIA_ID, mediaId);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientMediaMediaIdMetadataBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientMediaMediaIdMetadataBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantClientMediaMediaIdMetadataBuilder.GetActionBuilder prepareGet() {
        return new TenantClientMediaMediaIdMetadataBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder preparePut() {
        return new TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientMediaMediaIdMetadataBuilder.ArbitraryActionBuilder<TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder>
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
        protected TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder actionBuilder = new TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientMediaMediaIdMetadataBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantClientMediaMediaIdMetadataBuilder.ArbitraryActionBuilder<?> >
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
            return this.withUriParam(TenantClientMediaMediaIdBuilder.URI_PARAM_MEDIA_ID, mediaId);
        }

        /**
         * Fill the <code>client</code> URI parameter of this resource.
         * 
         * @param client the new value for the <code>client</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillClient(final String client) {
            return this.withUriParam(TenantClientBuilder.URI_PARAM_CLIENT, client);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantClientMediaMediaIdMetadataBuilder.ArbitraryActionBuilder<TenantClientMediaMediaIdMetadataBuilder.GetActionBuilder>
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
        protected TenantClientMediaMediaIdMetadataBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientMediaMediaIdMetadataBuilder.GetActionBuilder actionBuilder = new TenantClientMediaMediaIdMetadataBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientMediaMediaIdMetadataBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantClientMediaMediaIdMetadataBuilder.ArbitraryActionBuilder<TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder, Object>
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
        protected TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder actionBuilder = new TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>partial</code> query parameter value.
         * 
         * @param partial the value of the <code>partial</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>partial</code> query parameter set
         * 
         */
        public TenantClientMediaMediaIdMetadataBuilder.PutActionBuilder withPartial(Boolean partial) {
            return this.withSingleQuery("partial", partial);
        }

    }

}
