package e7;

import a.a;
import e0.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import nc.g0;
import u0.d;
import z4.i;

public final class h0
{
  public static final m0<Long> A;
  public static final m0<Boolean> A0;
  public static final m0<Long> B;
  public static final m0<Boolean> B0;
  public static final m0<Long> C;
  public static final m0<Boolean> C0;
  public static final m0<Long> D;
  public static final m0<Boolean> D0;
  public static final m0<Long> E;
  public static final m0<Integer> E0;
  public static final m0<Long> F;
  public static final m0<Boolean> F0;
  public static final m0<Long> G;
  public static final m0<Boolean> G0;
  public static final m0<Long> H;
  public static final m0<Boolean> H0;
  public static final m0<Long> I;
  public static final m0<Boolean> I0;
  public static final m0<Long> J;
  public static final m0<Boolean> J0;
  public static final m0<Long> K;
  public static final m0<Boolean> K0;
  public static final m0<Long> L;
  public static final m0<Boolean> L0;
  public static final m0<Integer> M;
  public static final m0<Boolean> M0;
  public static final m0<Long> N;
  public static final m0<Boolean> N0;
  public static final m0<Long> O;
  public static final m0<Boolean> O0;
  public static final m0<Integer> P;
  public static final m0<Boolean> P0;
  public static final m0<Integer> Q;
  public static final m0<Boolean> Q0;
  public static final m0<Integer> R;
  public static final m0<Boolean> R0;
  public static final m0<Integer> S;
  public static final m0<Boolean> S0;
  public static final m0<Integer> T;
  public static final m0<Boolean> T0;
  public static final m0<Long> U;
  public static final m0<Boolean> U0;
  public static final m0<Boolean> V;
  public static final m0<Boolean> V0;
  public static final m0<String> W;
  public static final m0<Boolean> W0;
  public static final m0<Long> X;
  public static final m0<Boolean> X0;
  public static final m0<Integer> Y;
  public static final m0<Boolean> Y0;
  public static final m0<Double> Z;
  public static final m0<Boolean> Z0;
  public static final List<m0<?>> a = Collections.synchronizedList(new ArrayList());
  public static final m0<Integer> a0;
  public static final m0<Boolean> a1;
  public static final m0<Long> b;
  public static final m0<Integer> b0;
  public static final m0<Boolean> b1;
  public static final m0<Long> c;
  public static final m0<Integer> c0;
  public static final m0<Boolean> c1;
  public static final m0<Long> d;
  public static final m0<Integer> d0;
  public static final m0<Boolean> d1;
  public static final m0<Long> e;
  public static final m0<Long> e0;
  public static final m0<Boolean> e1;
  public static final m0<String> f;
  public static final m0<Long> f0;
  public static final m0<Boolean> f1;
  public static final m0<String> g;
  public static final m0<Integer> g0;
  public static final m0<Integer> h;
  public static final m0<Integer> h0;
  public static final m0<Integer> i;
  public static final m0<String> i0;
  public static final m0<Integer> j;
  public static final m0<String> j0;
  public static final m0<Integer> k;
  public static final m0<String> k0;
  public static final m0<Integer> l;
  public static final m0<Long> l0;
  public static final m0<Integer> m;
  public static final m0<String> m0;
  public static final m0<Integer> n;
  public static final m0<String> n0;
  public static final m0<Integer> o;
  public static final m0<String> o0;
  public static final m0<Integer> p;
  public static final m0<String> p0;
  public static final m0<Integer> q;
  public static final m0<Long> q0;
  public static final m0<String> r;
  public static final m0<Integer> r0;
  public static final m0<String> s;
  public static final m0<Integer> s0;
  public static final m0<String> t;
  public static final m0<Integer> t0;
  public static final m0<Long> u;
  public static final m0<Boolean> u0;
  public static final m0<Long> v;
  public static final m0<Boolean> v0;
  public static final m0<Integer> w;
  public static final m0<Integer> w0;
  public static final m0<Integer> x;
  public static final m0<Boolean> x0;
  public static final m0<Long> y;
  public static final m0<Boolean> y0;
  public static final m0<Long> z;
  public static final m0<Boolean> z0;
  
  static
  {
    Collections.synchronizedSet(new HashSet());
    Object localObject1 = Long.valueOf(10000L);
    Object localObject2 = new q0(3);
    Integer localInteger1 = Integer.valueOf(0);
    b = a("measurement.ad_id_cache_time", localObject1, (l0)localObject2, false);
    Long localLong1 = Long.valueOf(3600000L);
    c = a("measurement.app_uninstalled_additional_ad_id_cache_time", localLong1, new q0(9), false);
    Long localLong2 = Long.valueOf(86400000L);
    d = a("measurement.monitoring.sample_period_millis", localLong2, new q0(12), false);
    e = a("measurement.config.cache_time", localLong2, new d(13), false);
    f = a("measurement.config.url_scheme", "https", new d(16), false);
    g = a("measurement.config.url_authority", "app-measurement.com", new g0(11), false);
    localObject2 = Integer.valueOf(100);
    h = a("measurement.upload.max_bundles", localObject2, new i(12), false);
    Integer localInteger2 = Integer.valueOf(65536);
    i = a("measurement.upload.max_batch_size", localInteger2, new g0(14), false);
    j = a("measurement.upload.max_bundle_size", localInteger2, new i(15), false);
    localInteger2 = Integer.valueOf(1000);
    k = a("measurement.upload.max_events_per_bundle", localInteger2, new q0(6), false);
    l = a("measurement.upload.max_events_per_day", Integer.valueOf(100000), new a(5), false);
    m = a("measurement.upload.max_error_events_per_day", localInteger2, new g0(4), false);
    n = a("measurement.upload.max_public_events_per_day", Integer.valueOf(50000), new d(5), false);
    o = a("measurement.upload.max_conversions_per_day", Integer.valueOf(10000), new q0(7), false);
    localInteger2 = Integer.valueOf(10);
    p = a("measurement.upload.max_realtime_events_per_day", localInteger2, new a(6), false);
    q = a("measurement.store.max_stored_events_per_app", Integer.valueOf(100000), new i(4), false);
    r = a("measurement.upload.url", "https://app-measurement.com/a", new d(6), false);
    s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", new q0(8), false);
    t = a("measurement.sgtm.service_upload_apps_list", "de.zalando.mobile", new g0(5), false);
    u = a("measurement.sgtm.upload.retry_interval", Long.valueOf(1800000L), new d(7), false);
    v = a("measurement.sgtm.upload.retry_max_wait", Long.valueOf(21600000L), new a(8), false);
    w = a("measurement.sgtm.upload.max_queued_batches", Integer.valueOf(5000), new i(5), false);
    x = a("measurement.sgtm.upload.batches_retrieval_limit", localInteger2, new d(8), false);
    y = a("measurement.sgtm.upload.min_delay_after_startup", Long.valueOf(5000L), new q0(10), false);
    z = a("measurement.sgtm.upload.min_delay_after_broadcast", Long.valueOf(1000L), new a(9), false);
    A = a("measurement.sgtm.upload.min_delay_after_background", Long.valueOf(600000L), new g0(6), false);
    B = a("measurement.upload.backoff_period", Long.valueOf(43200000L), new d(9), false);
    C = a("measurement.upload.window_interval", localLong1, new a(10), false);
    D = a("measurement.upload.interval", localLong1, new i(6), false);
    E = a("measurement.upload.realtime_upload_interval", localObject1, new d(10), false);
    F = a("measurement.upload.debug_upload_interval", Long.valueOf(1000L), new q0(13), false);
    G = a("measurement.upload.minimum_delay", Long.valueOf(500L), new a(11), false);
    H = a("measurement.alarm_manager.minimum_interval", Long.valueOf(60000L), new g0(7), false);
    I = a("measurement.upload.stale_data_deletion_interval", localLong2, new d(11), false);
    J = a("measurement.upload.refresh_blacklisted_config_interval", Long.valueOf(604800000L), new q0(14), false);
    K = a("measurement.upload.initial_upload_delay_time", Long.valueOf(15000L), new a(12), false);
    L = a("measurement.upload.retry_time", Long.valueOf(1800000L), new d(12), false);
    M = a("measurement.upload.retry_count", Integer.valueOf(6), new q0(15), false);
    N = a("measurement.upload.max_queue_time", Long.valueOf(518400000L), new a(13), false);
    O = a("measurement.upload.google_signal_max_queue_time", Long.valueOf(300000L), new g0(8), false);
    P = a("measurement.lifetimevalue.max_currency_tracked", Integer.valueOf(4), new q0(16), false);
    Q = a("measurement.audience.filter_result_max_count", Integer.valueOf(200), new a(14), false);
    R = a("measurement.upload.max_public_user_properties", localObject2, null, false);
    S = a("measurement.upload.max_event_name_cardinality", Integer.valueOf(2000), null, false);
    T = a("measurement.upload.max_public_event_params", localObject2, null, false);
    U = a("measurement.service_client.idle_disconnect_millis", Long.valueOf(5000L), new i(8), false);
    localObject1 = Boolean.FALSE;
    V = a("measurement.test.boolean_flag", localObject1, new d(14), false);
    W = a("measurement.test.string_flag", "---", new q0(17), false);
    X = a("measurement.test.long_flag", Long.valueOf(-1L), new g0(9), false);
    a("measurement.test.cached_long_flag", Long.valueOf(-1L), new d(15), true);
    Y = a("measurement.test.int_flag", Integer.valueOf(-2), new q0(18), false);
    Z = a("measurement.test.double_flag", Double.valueOf(-3.0D), new a(16), false);
    a0 = a("measurement.experiment.max_ids", Integer.valueOf(50), new i(9), false);
    b0 = a("measurement.upload.max_item_scoped_custom_parameters", Integer.valueOf(27), new q0(19), false);
    c0 = a("measurement.upload.max_event_parameter_value_length", Integer.valueOf(500), new a(17), true);
    d0 = a("measurement.max_bundles_per_iteration", localObject2, new a(18), false);
    e0 = a("measurement.sdk.attribution.cache.ttl", Long.valueOf(604800000L), new g0(10), false);
    f0 = a("measurement.redaction.app_instance_id.ttl", Long.valueOf(7200000L), new q0(20), false);
    g0 = a("measurement.rb.attribution.client.min_ad_services_version", Integer.valueOf(7), new a(19), false);
    h0 = a("measurement.dma_consent.max_daily_dcu_realtime_events", Integer.valueOf(1), new i(10), false);
    i0 = a("measurement.rb.attribution.uri_scheme", "https", new d(18), false);
    j0 = a("measurement.rb.attribution.uri_authority", "google-analytics.com", new q0(21), false);
    k0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new a(20), false);
    l0 = a("measurement.session.engagement_interval", localLong1, new d(19), false);
    m0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new q0(22), false);
    n0 = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", new a(21), false);
    o0 = a("measurement.rb.attribution.event_params", "value|currency", new d(20), false);
    p0 = a("measurement.rb.attribution.query_parameters_to_remove", "", new q0(23), false);
    q0 = a("measurement.rb.attribution.max_queue_time", Long.valueOf(864000000L), new a(22), false);
    r0 = a("measurement.rb.attribution.max_retry_delay_seconds", Integer.valueOf(16), new g0(12), false);
    s0 = a("measurement.rb.attribution.client.min_time_after_boot_seconds", localInteger1, new d(21), false);
    a("measurement.rb.attribution.max_trigger_uris_queried_at_once", localInteger1, new q0(24), false);
    t0 = a("measurement.rb.max_trigger_registrations_per_day", Integer.valueOf(1000), new a(23), false);
    localObject2 = Boolean.TRUE;
    u0 = a("measurement.config.bundle_for_all_apps_on_backgrounded", localObject2, new d(22), false);
    v0 = a("measurement.config.notify_trigger_uris_on_backgrounded", localObject2, new q0(25), false);
    w0 = a("measurement.rb.attribution.notify_app_delay_millis", localInteger1, new g0(13), false);
    x0 = a("measurement.quality.checksum", localObject1, null, false);
    y0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", localObject1, new d(23), false);
    z0 = a("measurement.audience.refresh_event_count_filters_timestamp", localObject1, new q0(26), false);
    A0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", localObject1, new a(25), true);
    B0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", localObject1, new i(13), false);
    C0 = a("measurement.integration.disable_firebase_instance_id", localObject1, new d(24), false);
    D0 = a("measurement.collection.service.update_with_analytics_fix", localObject1, new q0(27), false);
    E0 = a("measurement.service.storage_consent_support_version", Integer.valueOf(203600), new a(26), false);
    F0 = a("measurement.service.store_null_safelist", localObject2, new d(25), false);
    G0 = a("measurement.service.store_safelist", localObject2, new a(27), false);
    H0 = a("measurement.session_stitching_token_enabled", localObject1, new i(14), false);
    I0 = a("measurement.sgtm.upload_queue", localObject1, new d(26), false);
    J0 = a("measurement.sgtm.google_signal.enable", localObject1, new k0(1), false);
    K0 = a("measurement.sgtm.no_proxy.service", localObject1, new a(28), false);
    L0 = a("measurement.sgtm.service.batching_on_backgrounded", localObject1, new g0(15), false);
    M0 = a("measurement.sgtm.no_proxy.client.dev", localObject1, new d(27), true);
    N0 = a("measurement.sgtm.client.upload_on_backgrounded.dev", localObject1, new k0(0), true);
    O0 = a("measurement.sgtm.client.scion_upload_action.dev", localObject1, new a(29), true);
    P0 = a("measurement.gmscore_client_telemetry", localObject1, new i(2), false);
    Q0 = a("measurement.rb.attribution.service", localObject2, new d(1), true);
    R0 = a("measurement.rb.attribution.client2", localObject2, new q0(4), true);
    S0 = a("measurement.rb.attribution.uuid_generation", localObject2, new a(3), false);
    T0 = a("measurement.rb.attribution.enable_trigger_redaction", localObject2, new g0(3), false);
    a("measurement.rb.attribution.followup1.service", localObject1, new d(2), false);
    U0 = a("measurement.rb.attribution.retry_disposition", localObject1, new q0(5), false);
    V0 = a("measurement.rb.attribution.ad_campaign_info", localObject2, new a(4), false);
    W0 = a("measurement.client.sessions.enable_fix_background_engagement", localObject1, new i(3), false);
    X0 = a("measurement.fix_engagement_on_reset_analytics_data", localObject2, new d(3), false);
    Y0 = a("measurement.set_default_event_parameters_propagate_clear.service.dev", localObject1, new a(7), false);
    Z0 = a("measurement.set_default_event_parameters_propagate_clear.client.dev", localObject1, new q0(11), false);
    a1 = a("measurement.set_default_event_parameters.fix_deferred_analytics_collection", localObject1, new i(7), false);
    b1 = a("measurement.chimera.parameter.service", localObject2, new a(15), false);
    c1 = a("measurement.service.ad_impression.convert_value_to_double", localObject2, new d(17), false);
    a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", localObject2, new i(11), false);
    a("measurement.remove_conflicting_first_party_apis.dev", localObject1, new a(24), false);
    d1 = a("measurement.rb.attribution.service.trigger_uris_high_priority", localObject2, new q0(28), false);
    e1 = a("measurement.rb.attribution.client.get_trigger_uris_async", localObject1, new a(2), false);
    f1 = a("measurement.backfill_session_ids.service", localObject1, new d(4), false);
  }
  
  public static m0 a(String paramString, Object paramObject, l0 paraml0, boolean paramBoolean)
  {
    paramString = new m0(paramString, paramObject, paraml0);
    if (paramBoolean) {
      a.add(paramString);
    }
    return paramString;
  }
}

/* Location:
 * Qualified Name:     e7.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */