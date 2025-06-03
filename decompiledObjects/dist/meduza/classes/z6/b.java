package z6;

import j6.d;

public final class b
{
  public static final d a;
  public static final d b;
  public static final d c;
  public static final d d;
  
  static
  {
    new d("cancel_target_direct_transfer", 1L);
    new d("delete_credential", 1L);
    new d("delete_device_public_key", 1L);
    new d("get_or_generate_device_public_key", 1L);
    new d("get_passkeys", 1L);
    new d("update_passkey", 1L);
    a = new d("is_user_verifying_platform_authenticator_available_for_credential", 1L);
    b = new d("is_user_verifying_platform_authenticator_available", 1L);
    c = new d("privileged_api_list_credentials", 2L);
    new d("start_target_direct_transfer", 1L);
    new d("first_party_api_get_link_info", 1L);
    new d("zero_party_api_register", 3L);
    new d("zero_party_api_sign", 3L);
    new d("zero_party_api_list_discoverable_credentials", 2L);
    new d("zero_party_api_authenticate_passkey", 1L);
    new d("zero_party_api_register_passkey", 1L);
    new d("zero_party_api_register_passkey_with_sync_account", 1L);
    new d("zero_party_api_get_hybrid_client_registration_pending_intent", 1L);
    new d("zero_party_api_get_hybrid_client_sign_pending_intent", 1L);
    d = new d("get_browser_hybrid_client_sign_pending_intent", 1L);
    new d("get_browser_hybrid_client_registration_pending_intent", 1L);
    new d("privileged_authenticate_passkey", 1L);
    new d("privileged_register_passkey_with_sync_account", 1L);
    new d("zero_party_api_get_privileged_hybrid_client_registration_pending_intent", 1L);
    new d("zero_party_api_get_privileged_hybrid_client_sign_pending_intent", 1L);
  }
}

/* Location:
 * Qualified Name:     z6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */