package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zznw implements zznt {
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

    static {
        zzif zza2 = new zzif(zzhu.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.ad_id_cache_time", 10000L);
        zzb = zza2.zza("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        zzc = zza2.zza("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        zzd = zza2.zza("measurement.max_bundles_per_iteration", 100L);
        zze = zza2.zza("measurement.config.cache_time", 86400000L);
        zza2.zza("measurement.log_tag", "FA");
        zzf = zza2.zza("measurement.config.url_authority", "app-measurement.com");
        zzg = zza2.zza("measurement.config.url_scheme", "https");
        zzh = zza2.zza("measurement.upload.debug_upload_interval", 1000L);
        zzi = zza2.zza("measurement.session.engagement_interval", 3600000L);
        zzj = zza2.zza("measurement.rb.attribution.event_params", "value|currency");
        zza2.zza("measurement.id.rb.attribution.app_allowlist", 0L);
        zza2.zza("measurement.id.rb.attribution.notify_app_delay_millis", 0L);
        zza2.zza("measurement.id.rb.attribution.client.min_time_after_boot_seconds", 0L);
        zzk = zza2.zza("measurement.upload.google_signal_max_queue_time", 605000L);
        zzl = zza2.zza("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        zzm = zza2.zza("measurement.lifetimevalue.max_currency_tracked", 4L);
        zzn = zza2.zza("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        zzo = zza2.zza("measurement.upload.max_event_parameter_value_length", 500L);
        zzp = zza2.zza("measurement.store.max_stored_events_per_app", 100000L);
        zzq = zza2.zza("measurement.experiment.max_ids", 50L);
        zzr = zza2.zza("measurement.audience.filter_result_max_count", 200L);
        zzs = zza2.zza("measurement.upload.max_item_scoped_custom_parameters", 27L);
        zzt = zza2.zza("measurement.rb.max_trigger_registrations_per_day", 1000L);
        zzu = zza2.zza("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L);
        zzv = zza2.zza("measurement.rb.attribution.client.min_ad_services_version", 7L);
        zzw = zza2.zza("measurement.alarm_manager.minimum_interval", 60000L);
        zzx = zza2.zza("measurement.upload.minimum_delay", 500L);
        zzy = zza2.zza("measurement.monitoring.sample_period_millis", 86400000L);
        zzz = zza2.zza("measurement.rb.attribution.notify_app_delay_millis", 0L);
        zzaa = zza2.zza("measurement.config.notify_trigger_uris_on_backgrounded", true);
        zzab = zza2.zza("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        zzac = zza2.zza("measurement.upload.realtime_upload_interval", 10000L);
        zzad = zza2.zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        zza2.zza("measurement.config.cache_time.service", 3600000L);
        zzae = zza2.zza("measurement.service_client.idle_disconnect_millis", 5000L);
        zza2.zza("measurement.log_tag.service", "FA-SVC");
        zza2.zza("measurement.sgtm.app_allowlist", "*");
        zzaf = zza2.zza("measurement.sgtm.service_upload_apps_list", "de.zalando.mobile");
        zzag = zza2.zza("measurement.sgtm.upload.batches_retrieval_limit", 10L);
        zzah = zza2.zza("measurement.sgtm.upload.max_queued_batches", 5000L);
        zzai = zza2.zza("measurement.sgtm.upload.min_delay_after_background", 600000L);
        zzaj = zza2.zza("measurement.sgtm.upload.min_delay_after_broadcast", 1000L);
        zzak = zza2.zza("measurement.sgtm.upload.min_delay_after_startup", 5000L);
        zzal = zza2.zza("measurement.sgtm.upload.retry_interval", 1800000L);
        zzam = zza2.zza("measurement.sgtm.upload.retry_max_wait", 21600000L);
        zzan = zza2.zza("measurement.upload.stale_data_deletion_interval", 86400000L);
        zzao = zza2.zza("measurement.rb.attribution.max_retry_delay_seconds", 16L);
        zzap = zza2.zza("measurement.rb.attribution.client.min_time_after_boot_seconds", 0L);
        zzaq = zza2.zza("measurement.rb.attribution.uri_authority", "google-analytics.com");
        zzar = zza2.zza("measurement.rb.attribution.max_queue_time", 864000000L);
        zzas = zza2.zza("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        zzat = zza2.zza("measurement.rb.attribution.query_parameters_to_remove", "");
        zzau = zza2.zza("measurement.rb.attribution.uri_scheme", "https");
        zzav = zza2.zza("measurement.sdk.attribution.cache.ttl", 604800000L);
        zzaw = zza2.zza("measurement.redaction.app_instance_id.ttl", 7200000L);
        zzax = zza2.zza("measurement.upload.backoff_period", 43200000L);
        zzay = zza2.zza("measurement.upload.initial_upload_delay_time", 15000L);
        zzaz = zza2.zza("measurement.upload.interval", 3600000L);
        zzba = zza2.zza("measurement.upload.max_bundle_size", 65536L);
        zzbb = zza2.zza("measurement.upload.max_bundles", 100L);
        zzbc = zza2.zza("measurement.upload.max_conversions_per_day", 500L);
        zzbd = zza2.zza("measurement.upload.max_error_events_per_day", 1000L);
        zzbe = zza2.zza("measurement.upload.max_events_per_bundle", 1000L);
        zzbf = zza2.zza("measurement.upload.max_events_per_day", 100000L);
        zzbg = zza2.zza("measurement.upload.max_public_events_per_day", 50000L);
        zzbh = zza2.zza("measurement.upload.max_queue_time", 518400000L);
        zzbi = zza2.zza("measurement.upload.max_realtime_events_per_day", 10L);
        zzbj = zza2.zza("measurement.upload.max_batch_size", 65536L);
        zzbk = zza2.zza("measurement.upload.retry_count", 6L);
        zzbl = zza2.zza("measurement.upload.retry_time", 1800000L);
        zzbm = zza2.zza("measurement.upload.url", "https://app-measurement.com/a");
        zzbn = zza2.zza("measurement.upload.window_interval", 3600000L);
        zzbo = zza2.zza("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zza() {
        return zza.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzaa() {
        return zzai.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzab() {
        return zzaj.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzac() {
        return zzak.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzad() {
        return zzal.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzae() {
        return zzam.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzaf() {
        return zzan.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzag() {
        return zzao.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzah() {
        return zzap.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzai() {
        return zzar.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzaj() {
        return zzav.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzak() {
        return zzaw.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzal() {
        return zzax.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzam() {
        return zzay.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzan() {
        return zzaz.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzao() {
        return zzba.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzap() {
        return zzbb.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzaq() {
        return zzbc.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzar() {
        return zzbd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzas() {
        return zzbe.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzat() {
        return zzbf.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzau() {
        return zzbg.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzav() {
        return zzbh.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzaw() {
        return zzbi.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzax() {
        return zzbj.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzay() {
        return zzbk.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzaz() {
        return zzbl.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzb() {
        return zzb.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzba() {
        return zzbn.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbb() {
        return zzf.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbc() {
        return zzg.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbd() {
        return zzj.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbe() {
        return zzl.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbf() {
        return zzab.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbg() {
        return zzaf.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbh() {
        return zzaq.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbi() {
        return zzas.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbj() {
        return zzat.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbk() {
        return zzau.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbl() {
        return zzbm.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final String zzbm() {
        return zzbo.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zzbn() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zzbo() {
        return zzaa.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzc() {
        return zzd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzd() {
        return zze.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zze() {
        return zzh.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzf() {
        return zzi.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzg() {
        return zzk.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzh() {
        return zzm.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzi() {
        return zzn.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzj() {
        return zzo.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzk() {
        return zzp.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzl() {
        return zzq.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzm() {
        return zzr.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzn() {
        return zzs.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzo() {
        return zzt.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzp() {
        return zzu.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzq() {
        return zzv.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzr() {
        return zzw.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzs() {
        return zzx.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzt() {
        return zzy.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzu() {
        return zzz.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzv() {
        return zzac.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzw() {
        return zzad.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzx() {
        return zzae.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzy() {
        return zzag.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final long zzz() {
        return zzah.zza().longValue();
    }
}
