.class public final Lp2/k;
.super Lq1/b;
.source "SourceFile"


# static fields
.field public static final c:Lp2/k;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp2/k;

    invoke-direct {v0}, Lp2/k;-><init>()V

    sput-object v0, Lp2/k;->c:Lp2/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x5

    invoke-direct {p0, v0, v1}, Lq1/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(Lu1/c;)V
    .locals 1

    const-string v0, "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1"

    invoke-virtual {p1, v0}, Lu1/c;->m(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1"

    invoke-virtual {p1, v0}, Lu1/c;->m(Ljava/lang/String;)V

    return-void
.end method
