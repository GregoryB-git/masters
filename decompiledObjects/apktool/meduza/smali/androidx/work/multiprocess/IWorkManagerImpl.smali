.class public interface abstract Landroidx/work/multiprocess/IWorkManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/multiprocess/IWorkManagerImpl$Stub;
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "androidx$work$multiprocess$IWorkManagerImpl"

    const/16 v1, 0x24

    const/16 v2, 0x2e

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/multiprocess/IWorkManagerImpl;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract K()V
.end method

.method public abstract O1()V
.end method

.method public abstract Q()V
.end method

.method public abstract T0()V
.end method

.method public abstract W()V
.end method

.method public abstract b1()V
.end method

.method public abstract f2()V
.end method

.method public abstract m0()V
.end method

.method public abstract n1()V
.end method

.method public abstract w1()V
.end method
