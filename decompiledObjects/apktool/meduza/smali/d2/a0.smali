.class public final Ld2/a0;
.super Lc2/i;
.source "SourceFile"


# instance fields
.field public a:Landroid/webkit/TracingController;

.field public b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc2/i;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ld2/i0;->z:Ld2/a$g;

    .line 5
    .line 6
    invoke-virtual {v0}, Ld2/a$g;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ld2/l;->a()Landroid/webkit/TracingController;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 18
    .line 19
    iput-object v2, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Ld2/a;->d()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iput-object v2, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 29
    .line 30
    sget-object v0, Ld2/j0$b;->a:Ld2/k0;

    .line 31
    .line 32
    invoke-interface {v0}, Ld2/k0;->getTracingController()Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :cond_1
    invoke-static {}, Ld2/i0;->a()Ljava/lang/UnsupportedOperationException;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    throw v0
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
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


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    sget-object v0, Ld2/i0;->z:Ld2/a$g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld2/a$g;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ld2/l;->a()Landroid/webkit/TracingController;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 20
    .line 21
    invoke-static {v0}, Ld2/l;->d(Landroid/webkit/TracingController;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_1
    invoke-virtual {v0}, Ld2/a;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    sget-object v0, Ld2/j0$b;->a:Ld2/k0;

    .line 37
    .line 38
    invoke-interface {v0}, Ld2/k0;->getTracingController()Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 45
    .line 46
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;->isTracing()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    return v0

    .line 51
    :cond_3
    invoke-static {}, Ld2/i0;->a()Ljava/lang/UnsupportedOperationException;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    throw v0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
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

.method public final b(Lc2/h;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    sget-object v0, Ld2/i0;->z:Ld2/a$g;

    .line 4
    .line 5
    invoke-virtual {v0}, Ld2/a$g;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ld2/l;->a()Landroid/webkit/TracingController;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 22
    .line 23
    invoke-static {v0, p1}, Ld2/l;->f(Landroid/webkit/TracingController;Lc2/h;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ld2/a;->d()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    sget-object v0, Ld2/j0$b;->a:Ld2/k0;

    .line 38
    .line 39
    invoke-interface {v0}, Ld2/k0;->getTracingController()Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 44
    .line 45
    :cond_2
    iget-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 46
    .line 47
    iget v1, p1, Lc2/h;->a:I

    .line 48
    .line 49
    iget-object v2, p1, Lc2/h;->b:Ljava/util/ArrayList;

    .line 50
    .line 51
    iget p1, p1, Lc2/h;->c:I

    .line 52
    .line 53
    invoke-interface {v0, v1, v2, p1}, Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;->start(ILjava/util/Collection;I)V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void

    .line 57
    :cond_3
    invoke-static {}, Ld2/i0;->a()Ljava/lang/UnsupportedOperationException;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    throw p1

    .line 62
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string v0, "Tracing config must be non null"

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final c(Ljava/io/FileOutputStream;Ljava/util/concurrent/ExecutorService;)Z
    .locals 2

    .line 1
    sget-object v0, Ld2/i0;->z:Ld2/a$g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld2/a$g;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ld2/l;->a()Landroid/webkit/TracingController;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ld2/a0;->a:Landroid/webkit/TracingController;

    .line 20
    .line 21
    invoke-static {v0, p1, p2}, Ld2/l;->g(Landroid/webkit/TracingController;Ljava/io/OutputStream;Ljava/util/concurrent/Executor;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_1
    invoke-virtual {v0}, Ld2/a;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    sget-object v0, Ld2/j0$b;->a:Ld2/k0;

    .line 37
    .line 38
    invoke-interface {v0}, Ld2/k0;->getTracingController()Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, Ld2/a0;->b:Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;

    .line 45
    .line 46
    invoke-interface {v0, p1, p2}, Lorg/chromium/support_lib_boundary/TracingControllerBoundaryInterface;->stop(Ljava/io/OutputStream;Ljava/util/concurrent/Executor;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_3
    invoke-static {}, Ld2/i0;->a()Ljava/lang/UnsupportedOperationException;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    throw p1
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
