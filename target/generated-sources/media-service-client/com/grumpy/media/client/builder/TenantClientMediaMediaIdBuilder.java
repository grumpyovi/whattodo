
package com.grumpy.media.client.builder;

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
 * <li>{@link #metadata()}</li>
 * </ul>
 * 
 */
public class TenantClientMediaMediaIdBuilder
    extends AbstractResourceBuilder<TenantClientMediaMediaIdBuilder>
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
     * Creates a new instance of the {@link TenantClientMediaMediaIdBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientMediaMediaIdBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientMediaMediaIdBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientMediaMediaIdBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientMediaMediaIdBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>mediaId</code> URI parameter of this resource.
     * 
     * @param mediaId the new value for the <code>mediaId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientMediaMediaIdBuilder fillMediaId(final String mediaId) {
        return this.withUriParam(TenantClientMediaMediaIdBuilder.URI_PARAM_MEDIA_ID, mediaId);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientMediaMediaIdBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientMediaMediaIdBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/metadata</code>.
     * 
     * @return an instance of {@link TenantClientMediaMediaIdMetadataBuilder}
     * 
     */
    public TenantClientMediaMediaIdMetadataBuilder metadata() {
        return new TenantClientMediaMediaIdMetadataBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantClientMediaMediaIdBuilder.GetActionBuilder prepareGet() {
        return new TenantClientMediaMediaIdBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantClientMediaMediaIdBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantClientMediaMediaIdBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientMediaMediaIdBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientMediaMediaIdBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientMediaMediaIdBuilder.ArbitraryActionBuilder<TenantClientMediaMediaIdBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientMediaMediaIdBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientMediaMediaIdBuilder.AnyActionBuilder>
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
        protected TenantClientMediaMediaIdBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientMediaMediaIdBuilder.AnyActionBuilder actionBuilder = new TenantClientMediaMediaIdBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientMediaMediaIdBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientMediaMediaIdBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientMediaMediaIdBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientMediaMediaIdBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientMediaMediaIdBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantClientMediaMediaIdBuilder.ArbitraryActionBuilder<?> >
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
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TenantClientMediaMediaIdBuilder.ArbitraryActionBuilder<TenantClientMediaMediaIdBuilder.DeleteActionBuilder>
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
        protected TenantClientMediaMediaIdBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientMediaMediaIdBuilder.DeleteActionBuilder actionBuilder = new TenantClientMediaMediaIdBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientMediaMediaIdBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantClientMediaMediaIdBuilder.ArbitraryActionBuilder<TenantClientMediaMediaIdBuilder.GetActionBuilder>
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
        protected TenantClientMediaMediaIdBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientMediaMediaIdBuilder.GetActionBuilder actionBuilder = new TenantClientMediaMediaIdBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientMediaMediaIdBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }

}
