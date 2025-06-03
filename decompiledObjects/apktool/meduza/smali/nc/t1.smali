.class public final Lnc/t1;
.super Lsc/i;
.source "SourceFile"

# interfaces
.implements Lnc/f1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsc/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Lnc/t1;
    .locals 0

    return-object p0
.end method

.method public final isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lsc/j;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
