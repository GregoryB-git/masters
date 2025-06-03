.class public interface abstract Landroidx/work/multiprocess/IListenableWorkerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/multiprocess/IListenableWorkerImpl$Stub;
    }
.end annotation


# static fields
.field public static final r:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "androidx$work$multiprocess$IListenableWorkerImpl"

    const/16 v1, 0x24

    const/16 v2, 0x2e

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/multiprocess/IListenableWorkerImpl;->r:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract N2()V
.end method

.method public abstract j1()V
.end method
