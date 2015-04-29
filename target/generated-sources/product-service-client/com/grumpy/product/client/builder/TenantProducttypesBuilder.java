
package com.grumpy.product.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/{tenant}/producttypes</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #productTypeCode()}</li>
 * </ul>
 * 
 */
public class TenantProducttypesBuilder
    extends AbstractResourceBuilder<TenantProducttypesBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/{tenant}/producttypes";
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
     * Creates a new instance of the {@link TenantProducttypesBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantProducttypesBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantProducttypesBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantProducttypesBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantProducttypesBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantProducttypesBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantProducttypesBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{productTypeCode}</code>.
     * 
     * @return an instance of {@link TenantProducttypesProductTypeCodeBuilder}
     * 
     */
    public TenantProducttypesProductTypeCodeBuilder productTypeCode() {
        return new TenantProducttypesProductTypeCodeBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{productTypeCode}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #productTypeCode()} method instead.
     * 
     * @return an instance of {@link TenantProducttypesProductTypeCodeBuilder}
     * @param productTypeCode the value of the <code>productTypeCode</code> URI parameter
     * 
     */
    public TenantProducttypesProductTypeCodeBuilder productTypeCode(String productTypeCode) {
        TenantProducttypesProductTypeCodeBuilder resourceBuilder = new TenantProducttypesProductTypeCodeBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillProductTypeCode(productTypeCode);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantProducttypesBuilder.GetActionBuilder prepareGet() {
        return new TenantProducttypesBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantProducttypesBuilder.PostActionBuilder preparePost() {
        return new TenantProducttypesBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantProducttypesBuilder.AnyActionBuilder prepareAny() {
        return new TenantProducttypesBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantProducttypesBuilder.ArbitraryActionBuilder<TenantProducttypesBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantProducttypesBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantProducttypesBuilder.AnyActionBuilder>
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
        protected TenantProducttypesBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProducttypesBuilder.AnyActionBuilder actionBuilder = new TenantProducttypesBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProducttypesBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProducttypesBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProducttypesBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantProducttypesBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantProducttypesBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantProducttypesBuilder.ArbitraryActionBuilder<?> >
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
            return this.withUriParam(TenantProducttypesBuilder.URI_PARAM_TENANT, tenant);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantProducttypesBuilder.ArbitraryActionBuilder<TenantProducttypesBuilder.GetActionBuilder>
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
        protected TenantProducttypesBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProducttypesBuilder.GetActionBuilder actionBuilder = new TenantProducttypesBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantProducttypesBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>pageNumber</code> query parameter value.
         * 
         * @param pageNumber the value of the <code>pageNumber</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>pageNumber</code> query parameter set
         * 
         */
        public TenantProducttypesBuilder.GetActionBuilder withPageNumber(Integer pageNumber) {
            return this.withSingleQuery("pageNumber", pageNumber);
        }

        /**
         * Sets the <code>pageSize</code> query parameter value.
         * 
         * @param pageSize the value of the <code>pageSize</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>pageSize</code> query parameter set
         * 
         */
        public TenantProducttypesBuilder.GetActionBuilder withPageSize(Integer pageSize) {
            return this.withSingleQuery("pageSize", pageSize);
        }

        /**
         * Sets the <code>sort</code> query parameter value.
         * 
         * @param sort the value of the <code>sort</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>sort</code> query parameter set
         * 
         */
        public TenantProducttypesBuilder.GetActionBuilder withSort(String sort) {
            return this.withSingleQuery("sort", sort);
        }

        /**
         * Sets the <code>q</code> query parameter value.
         * 
         * @param q the value of the <code>q</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>q</code> query parameter set
         * 
         */
        public TenantProducttypesBuilder.GetActionBuilder withQ(String q) {
            return this.withSingleQuery("q", q);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantProducttypesBuilder.ArbitraryActionBuilder<TenantProducttypesBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantProducttypesBuilder.PostActionBuilder, Object>
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
        protected TenantProducttypesBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantProducttypesBuilder.PostActionBuilder actionBuilder = new TenantProducttypesBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantProducttypesBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProducttypesBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantProducttypesBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantProducttypesBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }

}
