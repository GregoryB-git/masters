.class public final Lz2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/e;


# instance fields
.field public final synthetic a:LV2/k;

.field public final synthetic b:Lz2/o;


# direct methods
.method public constructor <init>(Lz2/o;LV2/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/n;->b:Lz2/o;

    .line 2
    .line 3
    iput-object p2, p0, Lz2/n;->a:LV2/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lz2/n;->b:Lz2/o;

    .line 2
    .line 3
    invoke-static {p1}, Lz2/o;->a(Lz2/o;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lz2/n;->a:LV2/k;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
