.class public final Lc1/b;
.super Lc1/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lc1/a$a;->b:Lc1/a$a;

    invoke-direct {p0, v0}, Lc1/b;-><init>(Lc1/a;)V

    return-void
.end method

.method public constructor <init>(Lc1/a;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lc1/a;-><init>()V

    .line 2
    iget-object v0, p0, Lc1/a;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
