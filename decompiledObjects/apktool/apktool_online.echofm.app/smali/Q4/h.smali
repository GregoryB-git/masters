.class public final synthetic LQ4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/c;

.field public final synthetic b:LV2/j;

.field public final synthetic c:LV2/j;

.field public final synthetic d:Ljava/util/Date;

.field public final synthetic e:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/c;LV2/j;LV2/j;Ljava/util/Date;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ4/h;->a:Lcom/google/firebase/remoteconfig/internal/c;

    .line 5
    .line 6
    iput-object p2, p0, LQ4/h;->b:LV2/j;

    .line 7
    .line 8
    iput-object p3, p0, LQ4/h;->c:LV2/j;

    .line 9
    .line 10
    iput-object p4, p0, LQ4/h;->d:Ljava/util/Date;

    .line 11
    .line 12
    iput-object p5, p0, LQ4/h;->e:Ljava/util/Map;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LQ4/h;->a:Lcom/google/firebase/remoteconfig/internal/c;

    .line 2
    .line 3
    iget-object v1, p0, LQ4/h;->b:LV2/j;

    .line 4
    .line 5
    iget-object v2, p0, LQ4/h;->c:LV2/j;

    .line 6
    .line 7
    iget-object v3, p0, LQ4/h;->d:Ljava/util/Date;

    .line 8
    .line 9
    iget-object v4, p0, LQ4/h;->e:Ljava/util/Map;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/google/firebase/remoteconfig/internal/c;->a(Lcom/google/firebase/remoteconfig/internal/c;LV2/j;LV2/j;Ljava/util/Date;Ljava/util/Map;LV2/j;)LV2/j;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
