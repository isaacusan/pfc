/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-08-14 15:32:06 UTC)
 * on 2013-08-19 at 04:20:56 UTC 
 * Modify at your own risk.
 */

package com.cloudnotes.noteendpoint;

/**
 * Service definition for Noteendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link NoteendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Noteendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.15.0-rc of the  library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://cloudnotetesting.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "noteendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Noteendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Noteendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getAllNotes".
   *
   * This request holds the parameters needed by the the noteendpoint server.  After setting any
   * optional parameters, call the {@link GetAllNotes#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public GetAllNotes getAllNotes() throws java.io.IOException {
    GetAllNotes result = new GetAllNotes();
    initialize(result);
    return result;
  }

  public class GetAllNotes extends NoteendpointRequest<com.cloudnotes.noteendpoint.model.CollectionResponseNote> {

    private static final String REST_PATH = "collectionresponse_note";

    /**
     * Create a request for the method "getAllNotes".
     *
     * This request holds the parameters needed by the the noteendpoint server.  After setting any
     * optional parameters, call the {@link GetAllNotes#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetAllNotes#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetAllNotes() {
      super(Noteendpoint.this, "GET", REST_PATH, null, com.cloudnotes.noteendpoint.model.CollectionResponseNote.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetAllNotes setAlt(java.lang.String alt) {
      return (GetAllNotes) super.setAlt(alt);
    }

    @Override
    public GetAllNotes setFields(java.lang.String fields) {
      return (GetAllNotes) super.setFields(fields);
    }

    @Override
    public GetAllNotes setKey(java.lang.String key) {
      return (GetAllNotes) super.setKey(key);
    }

    @Override
    public GetAllNotes setOauthToken(java.lang.String oauthToken) {
      return (GetAllNotes) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAllNotes setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAllNotes) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAllNotes setQuotaUser(java.lang.String quotaUser) {
      return (GetAllNotes) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAllNotes setUserIp(java.lang.String userIp) {
      return (GetAllNotes) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public GetAllNotes setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public GetAllNotes setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public GetAllNotes set(String parameterName, Object value) {
      return (GetAllNotes) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getNote".
   *
   * This request holds the parameters needed by the the noteendpoint server.  After setting any
   * optional parameters, call the {@link GetNote#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetNote getNote(java.lang.String id) throws java.io.IOException {
    GetNote result = new GetNote(id);
    initialize(result);
    return result;
  }

  public class GetNote extends NoteendpointRequest<com.cloudnotes.noteendpoint.model.Note> {

    private static final String REST_PATH = "note/{id}";

    /**
     * Create a request for the method "getNote".
     *
     * This request holds the parameters needed by the the noteendpoint server.  After setting any
     * optional parameters, call the {@link GetNote#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetNote#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetNote(java.lang.String id) {
      super(Noteendpoint.this, "GET", REST_PATH, null, com.cloudnotes.noteendpoint.model.Note.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetNote setAlt(java.lang.String alt) {
      return (GetNote) super.setAlt(alt);
    }

    @Override
    public GetNote setFields(java.lang.String fields) {
      return (GetNote) super.setFields(fields);
    }

    @Override
    public GetNote setKey(java.lang.String key) {
      return (GetNote) super.setKey(key);
    }

    @Override
    public GetNote setOauthToken(java.lang.String oauthToken) {
      return (GetNote) super.setOauthToken(oauthToken);
    }

    @Override
    public GetNote setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetNote) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetNote setQuotaUser(java.lang.String quotaUser) {
      return (GetNote) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetNote setUserIp(java.lang.String userIp) {
      return (GetNote) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetNote setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetNote set(String parameterName, Object value) {
      return (GetNote) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertNote".
   *
   * This request holds the parameters needed by the the noteendpoint server.  After setting any
   * optional parameters, call the {@link InsertNote#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.cloudnotes.noteendpoint.model.Note}
   * @return the request
   */
  public InsertNote insertNote(com.cloudnotes.noteendpoint.model.Note content) throws java.io.IOException {
    InsertNote result = new InsertNote(content);
    initialize(result);
    return result;
  }

  public class InsertNote extends NoteendpointRequest<com.cloudnotes.noteendpoint.model.Note> {

    private static final String REST_PATH = "note";

    /**
     * Create a request for the method "insertNote".
     *
     * This request holds the parameters needed by the the noteendpoint server.  After setting any
     * optional parameters, call the {@link InsertNote#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertNote#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.cloudnotes.noteendpoint.model.Note}
     * @since 1.13
     */
    protected InsertNote(com.cloudnotes.noteendpoint.model.Note content) {
      super(Noteendpoint.this, "POST", REST_PATH, content, com.cloudnotes.noteendpoint.model.Note.class);
    }

    @Override
    public InsertNote setAlt(java.lang.String alt) {
      return (InsertNote) super.setAlt(alt);
    }

    @Override
    public InsertNote setFields(java.lang.String fields) {
      return (InsertNote) super.setFields(fields);
    }

    @Override
    public InsertNote setKey(java.lang.String key) {
      return (InsertNote) super.setKey(key);
    }

    @Override
    public InsertNote setOauthToken(java.lang.String oauthToken) {
      return (InsertNote) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertNote setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertNote) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertNote setQuotaUser(java.lang.String quotaUser) {
      return (InsertNote) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertNote setUserIp(java.lang.String userIp) {
      return (InsertNote) super.setUserIp(userIp);
    }

    @Override
    public InsertNote set(String parameterName, Object value) {
      return (InsertNote) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listMyNotes".
   *
   * This request holds the parameters needed by the the noteendpoint server.  After setting any
   * optional parameters, call the {@link ListMyNotes#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListMyNotes listMyNotes() throws java.io.IOException {
    ListMyNotes result = new ListMyNotes();
    initialize(result);
    return result;
  }

  public class ListMyNotes extends NoteendpointRequest<com.cloudnotes.noteendpoint.model.CollectionResponseNote> {

    private static final String REST_PATH = "note";

    /**
     * Create a request for the method "listMyNotes".
     *
     * This request holds the parameters needed by the the noteendpoint server.  After setting any
     * optional parameters, call the {@link ListMyNotes#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListMyNotes#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListMyNotes() {
      super(Noteendpoint.this, "GET", REST_PATH, null, com.cloudnotes.noteendpoint.model.CollectionResponseNote.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListMyNotes setAlt(java.lang.String alt) {
      return (ListMyNotes) super.setAlt(alt);
    }

    @Override
    public ListMyNotes setFields(java.lang.String fields) {
      return (ListMyNotes) super.setFields(fields);
    }

    @Override
    public ListMyNotes setKey(java.lang.String key) {
      return (ListMyNotes) super.setKey(key);
    }

    @Override
    public ListMyNotes setOauthToken(java.lang.String oauthToken) {
      return (ListMyNotes) super.setOauthToken(oauthToken);
    }

    @Override
    public ListMyNotes setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListMyNotes) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListMyNotes setQuotaUser(java.lang.String quotaUser) {
      return (ListMyNotes) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListMyNotes setUserIp(java.lang.String userIp) {
      return (ListMyNotes) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListMyNotes setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListMyNotes setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListMyNotes set(String parameterName, Object value) {
      return (ListMyNotes) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeNote".
   *
   * This request holds the parameters needed by the the noteendpoint server.  After setting any
   * optional parameters, call the {@link RemoveNote#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveNote removeNote(java.lang.String id) throws java.io.IOException {
    RemoveNote result = new RemoveNote(id);
    initialize(result);
    return result;
  }

  public class RemoveNote extends NoteendpointRequest<Void> {

    private static final String REST_PATH = "note/{id}";

    /**
     * Create a request for the method "removeNote".
     *
     * This request holds the parameters needed by the the noteendpoint server.  After setting any
     * optional parameters, call the {@link RemoveNote#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveNote#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveNote(java.lang.String id) {
      super(Noteendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveNote setAlt(java.lang.String alt) {
      return (RemoveNote) super.setAlt(alt);
    }

    @Override
    public RemoveNote setFields(java.lang.String fields) {
      return (RemoveNote) super.setFields(fields);
    }

    @Override
    public RemoveNote setKey(java.lang.String key) {
      return (RemoveNote) super.setKey(key);
    }

    @Override
    public RemoveNote setOauthToken(java.lang.String oauthToken) {
      return (RemoveNote) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveNote setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveNote) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveNote setQuotaUser(java.lang.String quotaUser) {
      return (RemoveNote) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveNote setUserIp(java.lang.String userIp) {
      return (RemoveNote) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveNote setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveNote set(String parameterName, Object value) {
      return (RemoveNote) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateNote".
   *
   * This request holds the parameters needed by the the noteendpoint server.  After setting any
   * optional parameters, call the {@link UpdateNote#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.cloudnotes.noteendpoint.model.Note}
   * @return the request
   */
  public UpdateNote updateNote(com.cloudnotes.noteendpoint.model.Note content) throws java.io.IOException {
    UpdateNote result = new UpdateNote(content);
    initialize(result);
    return result;
  }

  public class UpdateNote extends NoteendpointRequest<com.cloudnotes.noteendpoint.model.Note> {

    private static final String REST_PATH = "note";

    /**
     * Create a request for the method "updateNote".
     *
     * This request holds the parameters needed by the the noteendpoint server.  After setting any
     * optional parameters, call the {@link UpdateNote#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateNote#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.cloudnotes.noteendpoint.model.Note}
     * @since 1.13
     */
    protected UpdateNote(com.cloudnotes.noteendpoint.model.Note content) {
      super(Noteendpoint.this, "PUT", REST_PATH, content, com.cloudnotes.noteendpoint.model.Note.class);
    }

    @Override
    public UpdateNote setAlt(java.lang.String alt) {
      return (UpdateNote) super.setAlt(alt);
    }

    @Override
    public UpdateNote setFields(java.lang.String fields) {
      return (UpdateNote) super.setFields(fields);
    }

    @Override
    public UpdateNote setKey(java.lang.String key) {
      return (UpdateNote) super.setKey(key);
    }

    @Override
    public UpdateNote setOauthToken(java.lang.String oauthToken) {
      return (UpdateNote) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateNote setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateNote) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateNote setQuotaUser(java.lang.String quotaUser) {
      return (UpdateNote) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateNote setUserIp(java.lang.String userIp) {
      return (UpdateNote) super.setUserIp(userIp);
    }

    @Override
    public UpdateNote set(String parameterName, Object value) {
      return (UpdateNote) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Noteendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Noteendpoint}. */
    @Override
    public Noteendpoint build() {
      return new Noteendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link NoteendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setNoteendpointRequestInitializer(
        NoteendpointRequestInitializer noteendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(noteendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
