.class public final Lp2/f;
.super Lq1/b;
.source "SourceFile"


# static fields
.field public static final c:Lp2/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp2/f;

    invoke-direct {v0}, Lp2/f;-><init>()V

    sput-object v0, Lp2/f;->c:Lp2/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xc

    const/16 v1, 0xd

    invoke-direct {p0, v0, v1}, Lq1/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(Lu1/c;)V
    .locals 1

    const-string v0, "UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL "

    invoke-virtual {p1, v0}, Lu1/c;->m(Ljava/lang/String;)V

    const-string v0, "UPDATE workspec SET content_uri_triggers = x\'\' WHERE content_uri_triggers is NULL"

    invoke-virtual {p1, v0}, Lu1/c;->m(Ljava/lang/String;)V

    return-void
.end method
