.class public final synthetic LK1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lorg/json/JSONObject;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:LK1/j;

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;LK1/j;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK1/h;->o:Lorg/json/JSONObject;

    .line 5
    .line 6
    iput-object p2, p0, LK1/h;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LK1/h;->q:LK1/j;

    .line 9
    .line 10
    iput-object p4, p0, LK1/h;->r:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LK1/h;->o:Lorg/json/JSONObject;

    .line 2
    .line 3
    iget-object v1, p0, LK1/h;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LK1/h;->q:LK1/j;

    .line 6
    .line 7
    iget-object v3, p0, LK1/h;->r:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LK1/j;->a(Lorg/json/JSONObject;Ljava/lang/String;LK1/j;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
