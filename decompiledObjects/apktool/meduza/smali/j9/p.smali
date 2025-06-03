.class public final Lj9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lka/d0;)Lma/n1;
    .locals 1

    invoke-virtual {p0}, Lka/d0;->Y()Lka/u;

    move-result-object p0

    const-string v0, "__local_write_time__"

    invoke-virtual {p0, v0}, Lka/u;->L(Ljava/lang/String;)Lka/d0;

    move-result-object p0

    invoke-virtual {p0}, Lka/d0;->b0()Lma/n1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lka/d0;)Lka/d0;
    .locals 1

    invoke-virtual {p0}, Lka/d0;->Y()Lka/u;

    move-result-object p0

    const-string v0, "__previous_value__"

    invoke-virtual {p0, v0}, Lka/u;->K(Ljava/lang/String;)Lka/d0;

    move-result-object p0

    invoke-static {p0}, Lj9/p;->c(Lka/d0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lj9/p;->b(Lka/d0;)Lka/d0;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static c(Lka/d0;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lka/d0;->Y()Lka/u;

    move-result-object p0

    const-string v0, "__type__"

    invoke-virtual {p0, v0}, Lka/u;->K(Ljava/lang/String;)Lka/d0;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lka/d0;->a0()Ljava/lang/String;

    move-result-object p0

    const-string v0, "server_timestamp"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method
