/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (unset).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "Pet", description = "the Pet API")
public interface PetApi {

    /**
     * POST /pet : Add a new pet to the store
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return Invalid input (status code 405)
     */

    @ApiOperation(value = "Add a new pet to the store", nickname = "addPet", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets") })
         }, tags={ "pet", })
    @ApiResponses(value = { 

        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet",
        consumes = "application/json"
    )
    CompletableFuture<ResponseEntity<Void>> addPet(

@ApiParam(value = "Pet object that needs to be added to the store", required = true )   @Valid @RequestBody Pet body);


    /**
     * DELETE /pet/{petId} : Deletes a pet
     *
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid pet value (status code 400)
     */

    @ApiOperation(value = "Deletes a pet", nickname = "deletePet", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets") })
         }, tags={ "pet", })
    @ApiResponses(value = { 

        @ApiResponse(code = 400, message = "Invalid pet value") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/pet/{petId}"
    )
    CompletableFuture<ResponseEntity<Void>> deletePet(@ApiParam(value = "Pet id to delete", required = true) @PathVariable("petId") Long petId

,
@ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey
);


    /**
     * GET /pet/findByStatus : Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (required)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     */

    @ApiOperation(value = "Finds Pets by status", nickname = "findPetsByStatus", notes = "Multiple status values can be provided with comma separated strings", response = Pet.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets") })
         }, tags={ "pet", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),

        @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/findByStatus",
        produces = "application/json"
    )
    CompletableFuture<ResponseEntity<List<Pet>>> findPetsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status

);


    /**
     * GET /pet/findByTags : Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (required)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     * @deprecated
     */

    @ApiOperation(value = "Finds Pets by tags", nickname = "findPetsByTags", notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", response = Pet.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets") })
         }, tags={ "pet", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),

        @ApiResponse(code = 400, message = "Invalid tag value") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/findByTags",
        produces = "application/json"
    )
    CompletableFuture<ResponseEntity<List<Pet>>> findPetsByTags(@NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags

);


    /**
     * GET /pet/{petId} : Find pet by ID
     * Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     */

    @ApiOperation(value = "Find pet by ID", nickname = "getPetById", notes = "Returns a single pet", response = Pet.class, authorizations = {
        
        @Authorization(value = "api_key")
         }, tags={ "pet", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation", response = Pet.class),

        @ApiResponse(code = 400, message = "Invalid ID supplied"),

        @ApiResponse(code = 404, message = "Pet not found") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/{petId}",
        produces = "application/json"
    )
    CompletableFuture<ResponseEntity<Pet>> getPetById(@ApiParam(value = "ID of pet to return", required = true) @PathVariable("petId") Long petId

);


    /**
     * PUT /pet : Update an existing pet
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 405)
     */

    @ApiOperation(value = "Update an existing pet", nickname = "updatePet", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets") })
         }, tags={ "pet", })
    @ApiResponses(value = { 

        @ApiResponse(code = 400, message = "Invalid ID supplied"),

        @ApiResponse(code = 404, message = "Pet not found"),

        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/pet",
        consumes = "application/json"
    )
    CompletableFuture<ResponseEntity<Void>> updatePet(

@ApiParam(value = "Pet object that needs to be added to the store", required = true )   @Valid @RequestBody Pet body);


    /**
     * POST /pet/{petId} : Updates a pet in the store with form data
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return Invalid input (status code 405)
     */

    @ApiOperation(value = "Updates a pet in the store with form data", nickname = "updatePetWithForm", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets") })
         }, tags={ "pet", })
    @ApiResponses(value = { 

        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet/{petId}",
        consumes = "application/x-www-form-urlencoded"
    )
    CompletableFuture<ResponseEntity<Void>> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated", required = true) @PathVariable("petId") Long petId

,

@ApiParam(value = "Updated name of the pet" ) @RequestParam(value="name", required=false)  String name,

@ApiParam(value = "Updated status of the pet" ) @RequestParam(value="status", required=false)  String status);


    /**
     * POST /pet/{petId}/uploadImage : uploads an image
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return successful operation (status code 200)
     */

    @ApiOperation(value = "uploads an image", nickname = "uploadFile", notes = "", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets") })
         }, tags={ "pet", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet/{petId}/uploadImage",
        produces = "application/json",
        consumes = "multipart/form-data"
    )
    CompletableFuture<ResponseEntity<ModelApiResponse>> uploadFile(@ApiParam(value = "ID of pet to update", required = true) @PathVariable("petId") Long petId

,

@ApiParam(value = "Additional data to pass to server" ) @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,

@ApiParam(value = "file to upload") @RequestParam("file") MultipartFile file);

}
