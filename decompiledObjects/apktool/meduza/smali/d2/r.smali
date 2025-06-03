.class public final Ld2/r;
.super Landroid/webkit/ServiceWorkerClient;
.source "SourceFile"


# instance fields
.field public final a:Lc2/f;


# direct methods
.method public constructor <init>(Lc2/f;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/ServiceWorkerClient;-><init>()V

    iput-object p1, p0, Ld2/r;->a:Lc2/f;

    return-void
.end method


# virtual methods
.method public final shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 1

    iget-object v0, p0, Ld2/r;->a:Lc2/f;

    invoke-virtual {v0, p1}, Lc2/f;->shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
