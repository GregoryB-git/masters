.class public final LB0/n$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final o:LB0/n$f;


# direct methods
.method public constructor <init>(LB0/n$f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB0/n$g;->o:LB0/n$f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n$g;->o:LB0/n$f;

    .line 2
    .line 3
    invoke-interface {v0}, LB0/n$f;->k()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
