.class public final synthetic LO5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO5/A$a;


# instance fields
.field public final synthetic a:Ljava/util/Map;

.field public final synthetic b:LV2/k;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO5/m;->a:Ljava/util/Map;

    .line 5
    .line 6
    iput-object p2, p0, LO5/m;->b:LV2/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LO5/m;->a:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p0, LO5/m;->b:LV2/k;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LO5/x;->o(Ljava/util/Map;LV2/k;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
