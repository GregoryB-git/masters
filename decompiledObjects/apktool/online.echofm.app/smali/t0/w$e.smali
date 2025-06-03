.class public final Lt0/w$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt0/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Lt0/w;


# direct methods
.method public constructor <init>(Lt0/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt0/w$e;->a:Lt0/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lt0/w;Lt0/w$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lt0/w$e;-><init>(Lt0/w;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/w$e;->a:Lt0/w;

    .line 2
    .line 3
    invoke-static {v0}, Lt0/w;->h0(Lt0/w;)Lk0/Y0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lt0/w$e;->a:Lt0/w;

    .line 10
    .line 11
    invoke-static {v0}, Lt0/w;->h0(Lt0/w;)Lk0/Y0$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lk0/Y0$a;->b()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/w$e;->a:Lt0/w;

    .line 2
    .line 3
    invoke-static {v0}, Lt0/w;->h0(Lt0/w;)Lk0/Y0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lt0/w$e;->a:Lt0/w;

    .line 10
    .line 11
    invoke-static {v0}, Lt0/w;->h0(Lt0/w;)Lk0/Y0$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lk0/Y0$a;->b()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
