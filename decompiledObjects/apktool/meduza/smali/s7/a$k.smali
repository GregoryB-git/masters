.class public final Ls7/a$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# static fields
.field public static final c:Ls7/a$k;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Ls7/a$k;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls7/a$k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls7/a$k;-><init>(I)V

    sput-object v0, Ls7/a$k;->c:Ls7/a$k;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    sget-object v0, Ls7/a;->f:Ls7/a$a;

    .line 2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ls7/a$a;->g(Ls7/a$k;Ljava/lang/Thread;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
