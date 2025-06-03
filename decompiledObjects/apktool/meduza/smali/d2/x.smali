.class public final Ld2/x;
.super Lc2/g;
.source "SourceFile"


# instance fields
.field public a:Landroid/webkit/ServiceWorkerController;

.field public b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

.field public final c:Ld2/y;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc2/g;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ld2/i0;->h:Ld2/a$c;

    .line 5
    .line 6
    invoke-virtual {v0}, Ld2/a$c;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-static {}, Ld2/d;->g()Landroid/webkit/ServiceWorkerController;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ld2/x;->a:Landroid/webkit/ServiceWorkerController;

    .line 18
    .line 19
    iput-object v2, p0, Ld2/x;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-static {}, Ld2/d;->g()Landroid/webkit/ServiceWorkerController;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Ld2/x;->a:Landroid/webkit/ServiceWorkerController;

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Ld2/x;->a:Landroid/webkit/ServiceWorkerController;

    .line 30
    .line 31
    invoke-static {v0}, Ld2/d;->i(Landroid/webkit/ServiceWorkerController;)Ld2/y;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Ld2/x;->c:Ld2/y;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v0}, Ld2/a;->d()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iput-object v2, p0, Ld2/x;->a:Landroid/webkit/ServiceWorkerController;

    .line 45
    .line 46
    sget-object v0, Ld2/j0$b;->a:Ld2/k0;

    .line 47
    .line 48
    invoke-interface {v0}, Ld2/k0;->getServiceWorkerController()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Ld2/x;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    .line 53
    .line 54
    new-instance v1, Ld2/y;

    .line 55
    .line 56
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;->getServiceWorkerWebSettings()Ljava/lang/reflect/InvocationHandler;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {v1, v0}, Ld2/y;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Ld2/x;->c:Ld2/y;

    .line 64
    .line 65
    :goto_0
    return-void

    .line 66
    :cond_2
    invoke-static {}, Ld2/i0;->a()Ljava/lang/UnsupportedOperationException;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    throw v0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
