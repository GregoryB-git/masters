package com.google.android.gms.internal.measurement;

public final class zznw
  implements zznt
{
  private static final zzhx<Long> zza;
  private static final zzhx<Boolean> zzaa;
  private static final zzhx<String> zzab;
  private static final zzhx<Long> zzac;
  private static final zzhx<Long> zzad;
  private static final zzhx<Long> zzae;
  private static final zzhx<String> zzaf;
  private static final zzhx<Long> zzag;
  private static final zzhx<Long> zzah;
  private static final zzhx<Long> zzai;
  private static final zzhx<Long> zzaj;
  private static final zzhx<Long> zzak;
  private static final zzhx<Long> zzal;
  private static final zzhx<Long> zzam;
  private static final zzhx<Long> zzan;
  private static final zzhx<Long> zzao;
  private static final zzhx<Long> zzap;
  private static final zzhx<String> zzaq;
  private static final zzhx<Long> zzar;
  private static final zzhx<String> zzas;
  private static final zzhx<String> zzat;
  private static final zzhx<String> zzau;
  private static final zzhx<Long> zzav;
  private static final zzhx<Long> zzaw;
  private static final zzhx<Long> zzax;
  private static final zzhx<Long> zzay;
  private static final zzhx<Long> zzaz;
  private static final zzhx<Long> zzb;
  private static final zzhx<Long> zzba;
  private static final zzhx<Long> zzbb;
  private static final zzhx<Long> zzbc;
  private static final zzhx<Long> zzbd;
  private static final zzhx<Long> zzbe;
  private static final zzhx<Long> zzbf;
  private static final zzhx<Long> zzbg;
  private static final zzhx<Long> zzbh;
  private static final zzhx<Long> zzbi;
  private static final zzhx<Long> zzbj;
  private static final zzhx<Long> zzbk;
  private static final zzhx<Long> zzbl;
  private static final zzhx<String> zzbm;
  private static final zzhx<Long> zzbn;
  private static final zzhx<String> zzbo;
  private static final zzhx<Boolean> zzc;
  private static final zzhx<Long> zzd;
  private static final zzhx<Long> zze;
  private static final zzhx<String> zzf;
  private static final zzhx<String> zzg;
  private static final zzhx<Long> zzh;
  private static final zzhx<Long> zzi;
  private static final zzhx<String> zzj;
  private static final zzhx<Long> zzk;
  private static final zzhx<String> zzl;
  private static final zzhx<Long> zzm;
  private static final zzhx<Long> zzn;
  private static final zzhx<Long> zzo;
  private static final zzhx<Long> zzp;
  private static final zzhx<Long> zzq;
  private static final zzhx<Long> zzr;
  private static final zzhx<Long> zzs;
  private static final zzhx<Long> zzt;
  private static final zzhx<Long> zzu;
  private static final zzhx<Long> zzv;
  private static final zzhx<Long> zzw;
  private static final zzhx<Long> zzx;
  private static final zzhx<Long> zzy;
  private static final zzhx<Long> zzz;
  
  static
  {
    zzif localzzif = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
    zza = localzzif.zza("measurement.ad_id_cache_time", 10000L);
    zzb = localzzif.zza("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
    zzc = localzzif.zza("measurement.config.bundle_for_all_apps_on_backgrounded", true);
    zzd = localzzif.zza("measurement.max_bundles_per_iteration", 100L);
    zze = localzzif.zza("measurement.config.cache_time", 86400000L);
    localzzif.zza("measurement.log_tag", "FA");
    zzf = localzzif.zza("measurement.config.url_authority", "app-measurement.com");
    zzg = localzzif.zza("measurement.config.url_scheme", "https");
    zzh = localzzif.zza("measurement.upload.debug_upload_interval", 1000L);
    zzi = localzzif.zza("measurement.session.engagement_interval", 3600000L);
    zzj = localzzif.zza("measurement.rb.attribution.event_params", "value|currency");
    localzzif.zza("measurement.id.rb.attribution.app_allowlist", 0L);
    localzzif.zza("measurement.id.rb.attribution.notify_app_delay_millis", 0L);
    localzzif.zza("measurement.id.rb.attribution.client.min_time_after_boot_seconds", 0L);
    zzk = localzzif.zza("measurement.upload.google_signal_max_queue_time", 605000L);
    zzl = localzzif.zza("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
    zzm = localzzif.zza("measurement.lifetimevalue.max_currency_tracked", 4L);
    zzn = localzzif.zza("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
    zzo = localzzif.zza("measurement.upload.max_event_parameter_value_length", 500L);
    zzp = localzzif.zza("measurement.store.max_stored_events_per_app", 100000L);
    zzq = localzzif.zza("measurement.experiment.max_ids", 50L);
    zzr = localzzif.zza("measurement.audience.filter_result_max_count", 200L);
    zzs = localzzif.zza("measurement.upload.max_item_scoped_custom_parameters", 27L);
    zzt = localzzif.zza("measurement.rb.max_trigger_registrations_per_day", 1000L);
    zzu = localzzif.zza("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L);
    zzv = localzzif.zza("measurement.rb.attribution.client.min_ad_services_version", 7L);
    zzw = localzzif.zza("measurement.alarm_manager.minimum_interval", 60000L);
    zzx = localzzif.zza("measurement.upload.minimum_delay", 500L);
    zzy = localzzif.zza("measurement.monitoring.sample_period_millis", 86400000L);
    zzz = localzzif.zza("measurement.rb.attribution.notify_app_delay_millis", 0L);
    zzaa = localzzif.zza("measurement.config.notify_trigger_uris_on_backgrounded", true);
    zzab = localzzif.zza("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
    zzac = localzzif.zza("measurement.upload.realtime_upload_interval", 10000L);
    zzad = localzzif.zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
    localzzif.zza("measurement.config.cache_time.service", 3600000L);
    zzae = localzzif.zza("measurement.service_client.idle_disconnect_millis", 5000L);
    localzzif.zza("measurement.log_tag.service", "FA-SVC");
    localzzif.zza("measurement.sgtm.app_allowlist", "*");
    zzaf = localzzif.zza("measurement.sgtm.service_upload_apps_list", "de.zalando.mobile");
    zzag = localzzif.zza("measurement.sgtm.upload.batches_retrieval_limit", 10L);
    zzah = localzzif.zza("measurement.sgtm.upload.max_queued_batches", 5000L);
    zzai = localzzif.zza("measurement.sgtm.upload.min_delay_after_background", 600000L);
    zzaj = localzzif.zza("measurement.sgtm.upload.min_delay_after_broadcast", 1000L);
    zzak = localzzif.zza("measurement.sgtm.upload.min_delay_after_startup", 5000L);
    zzal = localzzif.zza("measurement.sgtm.upload.retry_interval", 1800000L);
    zzam = localzzif.zza("measurement.sgtm.upload.retry_max_wait", 21600000L);
    zzan = localzzif.zza("measurement.upload.stale_data_deletion_interval", 86400000L);
    zzao = localzzif.zza("measurement.rb.attribution.max_retry_delay_seconds", 16L);
    zzap = localzzif.zza("measurement.rb.attribution.client.min_time_after_boot_seconds", 0L);
    zzaq = localzzif.zza("measurement.rb.attribution.uri_authority", "google-analytics.com");
    zzar = localzzif.zza("measurement.rb.attribution.max_queue_time", 864000000L);
    zzas = localzzif.zza("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
    zzat = localzzif.zza("measurement.rb.attribution.query_parameters_to_remove", "");
    zzau = localzzif.zza("measurement.rb.attribution.uri_scheme", "https");
    zzav = localzzif.zza("measurement.sdk.attribution.cache.ttl", 604800000L);
    zzaw = localzzif.zza("measurement.redaction.app_instance_id.ttl", 7200000L);
    zzax = localzzif.zza("measurement.upload.backoff_period", 43200000L);
    zzay = localzzif.zza("measurement.upload.initial_upload_delay_time", 15000L);
    zzaz = localzzif.zza("measurement.upload.interval", 3600000L);
    zzba = localzzif.zza("measurement.upload.max_bundle_size", 65536L);
    zzbb = localzzif.zza("measurement.upload.max_bundles", 100L);
    zzbc = localzzif.zza("measurement.upload.max_conversions_per_day", 500L);
    zzbd = localzzif.zza("measurement.upload.max_error_events_per_day", 1000L);
    zzbe = localzzif.zza("measurement.upload.max_events_per_bundle", 1000L);
    zzbf = localzzif.zza("measurement.upload.max_events_per_day", 100000L);
    zzbg = localzzif.zza("measurement.upload.max_public_events_per_day", 50000L);
    zzbh = localzzif.zza("measurement.upload.max_queue_time", 518400000L);
    zzbi = localzzif.zza("measurement.upload.max_realtime_events_per_day", 10L);
    zzbj = localzzif.zza("measurement.upload.max_batch_size", 65536L);
    zzbk = localzzif.zza("measurement.upload.retry_count", 6L);
    zzbl = localzzif.zza("measurement.upload.retry_time", 1800000L);
    zzbm = localzzif.zza("measurement.upload.url", "https://app-measurement.com/a");
    zzbn = localzzif.zza("measurement.upload.window_interval", 3600000L);
    zzbo = localzzif.zza("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
  }
  
  public final long zza()
  {
    return ((Long)zza.zza()).longValue();
  }
  
  public final long zzaa()
  {
    return ((Long)zzai.zza()).longValue();
  }
  
  public final long zzab()
  {
    return ((Long)zzaj.zza()).longValue();
  }
  
  public final long zzac()
  {
    return ((Long)zzak.zza()).longValue();
  }
  
  public final long zzad()
  {
    return ((Long)zzal.zza()).longValue();
  }
  
  public final long zzae()
  {
    return ((Long)zzam.zza()).longValue();
  }
  
  public final long zzaf()
  {
    return ((Long)zzan.zza()).longValue();
  }
  
  public final long zzag()
  {
    return ((Long)zzao.zza()).longValue();
  }
  
  public final long zzah()
  {
    return ((Long)zzap.zza()).longValue();
  }
  
  public final long zzai()
  {
    return ((Long)zzar.zza()).longValue();
  }
  
  public final long zzaj()
  {
    return ((Long)zzav.zza()).longValue();
  }
  
  public final long zzak()
  {
    return ((Long)zzaw.zza()).longValue();
  }
  
  public final long zzal()
  {
    return ((Long)zzax.zza()).longValue();
  }
  
  public final long zzam()
  {
    return ((Long)zzay.zza()).longValue();
  }
  
  public final long zzan()
  {
    return ((Long)zzaz.zza()).longValue();
  }
  
  public final long zzao()
  {
    return ((Long)zzba.zza()).longValue();
  }
  
  public final long zzap()
  {
    return ((Long)zzbb.zza()).longValue();
  }
  
  public final long zzaq()
  {
    return ((Long)zzbc.zza()).longValue();
  }
  
  public final long zzar()
  {
    return ((Long)zzbd.zza()).longValue();
  }
  
  public final long zzas()
  {
    return ((Long)zzbe.zza()).longValue();
  }
  
  public final long zzat()
  {
    return ((Long)zzbf.zza()).longValue();
  }
  
  public final long zzau()
  {
    return ((Long)zzbg.zza()).longValue();
  }
  
  public final long zzav()
  {
    return ((Long)zzbh.zza()).longValue();
  }
  
  public final long zzaw()
  {
    return ((Long)zzbi.zza()).longValue();
  }
  
  public final long zzax()
  {
    return ((Long)zzbj.zza()).longValue();
  }
  
  public final long zzay()
  {
    return ((Long)zzbk.zza()).longValue();
  }
  
  public final long zzaz()
  {
    return ((Long)zzbl.zza()).longValue();
  }
  
  public final long zzb()
  {
    return ((Long)zzb.zza()).longValue();
  }
  
  public final long zzba()
  {
    return ((Long)zzbn.zza()).longValue();
  }
  
  public final String zzbb()
  {
    return (String)zzf.zza();
  }
  
  public final String zzbc()
  {
    return (String)zzg.zza();
  }
  
  public final String zzbd()
  {
    return (String)zzj.zza();
  }
  
  public final String zzbe()
  {
    return (String)zzl.zza();
  }
  
  public final String zzbf()
  {
    return (String)zzab.zza();
  }
  
  public final String zzbg()
  {
    return (String)zzaf.zza();
  }
  
  public final String zzbh()
  {
    return (String)zzaq.zza();
  }
  
  public final String zzbi()
  {
    return (String)zzas.zza();
  }
  
  public final String zzbj()
  {
    return (String)zzat.zza();
  }
  
  public final String zzbk()
  {
    return (String)zzau.zza();
  }
  
  public final String zzbl()
  {
    return (String)zzbm.zza();
  }
  
  public final String zzbm()
  {
    return (String)zzbo.zza();
  }
  
  public final boolean zzbn()
  {
    return ((Boolean)zzc.zza()).booleanValue();
  }
  
  public final boolean zzbo()
  {
    return ((Boolean)zzaa.zza()).booleanValue();
  }
  
  public final long zzc()
  {
    return ((Long)zzd.zza()).longValue();
  }
  
  public final long zzd()
  {
    return ((Long)zze.zza()).longValue();
  }
  
  public final long zze()
  {
    return ((Long)zzh.zza()).longValue();
  }
  
  public final long zzf()
  {
    return ((Long)zzi.zza()).longValue();
  }
  
  public final long zzg()
  {
    return ((Long)zzk.zza()).longValue();
  }
  
  public final long zzh()
  {
    return ((Long)zzm.zza()).longValue();
  }
  
  public final long zzi()
  {
    return ((Long)zzn.zza()).longValue();
  }
  
  public final long zzj()
  {
    return ((Long)zzo.zza()).longValue();
  }
  
  public final long zzk()
  {
    return ((Long)zzp.zza()).longValue();
  }
  
  public final long zzl()
  {
    return ((Long)zzq.zza()).longValue();
  }
  
  public final long zzm()
  {
    return ((Long)zzr.zza()).longValue();
  }
  
  public final long zzn()
  {
    return ((Long)zzs.zza()).longValue();
  }
  
  public final long zzo()
  {
    return ((Long)zzt.zza()).longValue();
  }
  
  public final long zzp()
  {
    return ((Long)zzu.zza()).longValue();
  }
  
  public final long zzq()
  {
    return ((Long)zzv.zza()).longValue();
  }
  
  public final long zzr()
  {
    return ((Long)zzw.zza()).longValue();
  }
  
  public final long zzs()
  {
    return ((Long)zzx.zza()).longValue();
  }
  
  public final long zzt()
  {
    return ((Long)zzy.zza()).longValue();
  }
  
  public final long zzu()
  {
    return ((Long)zzz.zza()).longValue();
  }
  
  public final long zzv()
  {
    return ((Long)zzac.zza()).longValue();
  }
  
  public final long zzw()
  {
    return ((Long)zzad.zza()).longValue();
  }
  
  public final long zzx()
  {
    return ((Long)zzae.zza()).longValue();
  }
  
  public final long zzy()
  {
    return ((Long)zzag.zza()).longValue();
  }
  
  public final long zzz()
  {
    return ((Long)zzah.zza()).longValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zznw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */