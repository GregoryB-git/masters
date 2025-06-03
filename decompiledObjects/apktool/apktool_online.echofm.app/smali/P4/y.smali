.class public final synthetic LP4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB3/h;


# instance fields
.field public final synthetic a:LB3/F;


# direct methods
.method public synthetic constructor <init>(LB3/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP4/y;->a:LB3/F;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LB3/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP4/y;->a:LB3/F;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->a(LB3/F;LB3/e;)LP4/x;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
