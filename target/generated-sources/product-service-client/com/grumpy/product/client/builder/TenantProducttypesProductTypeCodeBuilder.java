
package com.grumpy.product.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/{productTypeCode}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantProducttypesProductTypeCodeBuilder
    extends AbstractResourceBuilder<TenantProducttypesProductTypeCodeBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/{productTypeCode}";
    /**
     * The static field for the <code>productTypeCode</code> URI parameter name.
     * 
     */
    protected final static String URI_PARAM_PRODUCT_TYPE_CODE = "productTypeCode";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_PRODUCT_TYPE_CODE };

    /**
     * Creates a new instance of the {@link TenantProducttypesProductTypeCodeBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantProducttypesProductTypeCodeBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantProducttypesProductTypeCodeBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantProducttypesProductTypeCodeBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantProducttypesProductTypeCodeBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>productTypeCode</code> URI parameter of this resource.
     * 
     * @param productTypeCode the new value for the <code>productTypeCode</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProducttypesProductTypeCodeBuilder fillProductTypeCode(final String productTypeCode) {
        return this.withUriParam(TenantProducttypesProductTypeCodeBuilder.URI_PARAM_PRODUCT_TYPE_CODE, productTypeCode);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProducttypesProductTypeCodeBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantProducttypesBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantProducttypesProductTypeCodeBuilder.GetActionBuilder prepareGet() {
        return new TenantProducttypesProductTypeCodeBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantProducttypesProductTypeCodeBuilder.PutActionBuilder preparePut() {
        return new TenantProducttypesProductTypeCodeBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder prepareAny() {
        return new TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantProducttypesProductTypeCodeBuilder.ArbitraryActionBuilder<TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder>
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
        protected TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder actionBuilder = new TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantProducttypesProductTypeCodeBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantProducttypesProductTypeCodeBuilder.ArbitraryActionBuilder<?> >
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
         * Fill the <code>productTypeCode</code> URI parameter of this resource.
         * 
         * @param productTypeCode the new value for the <code>productTypeCode</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillProductTypeCode(final String productTypeCode) {
            return this.withUriParam(TenantProducttypesProductTypeCodeBuilder.URI_PARAM_PRODUCT_TYPE_CODE, productTypeCode);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantProducttypesBuilder.URI_PARAM_TENANT, tenant);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantProducttypesProductTypeCodeBuilder.ArbitraryActionBuilder<TenantProducttypesProductTypeCodeBuilder.GetActionBuilder>
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
        protected TenantProducttypesProductTypeCodeBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProducttypesProductTypeCodeBuilder.GetActionBuilder actionBuilder = new TenantProducttypesProductTypeCodeBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantProducttypesProductTypeCodeBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantProducttypesProductTypeCodeBuilder.ArbitraryActionBuilder<TenantProducttypesProductTypeCodeBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantProducttypesProductTypeCodeBuilder.PutActionBuilder, Object>
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
        protected TenantProducttypesProductTypeCodeBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProducttypesProductTypeCodeBuilder.PutActionBuilder actionBuilder = new TenantProducttypesProductTypeCodeBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProducttypesProductTypeCodeBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProducttypesProductTypeCodeBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProducttypesProductTypeCodeBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProducttypesProductTypeCodeBuilder.PutActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>partial</code> query parameter value.
         * 
         * @param partial the value of the <code>partial</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>partial</code> query parameter set
         * 
         */
        public TenantProducttypesProductTypeCodeBuilder.PutActionBuilder withPartial(Boolean partial) {
            return this.withSingleQuery("partial", partial);
        }

    }

}
