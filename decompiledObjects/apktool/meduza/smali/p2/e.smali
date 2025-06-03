.class public final Lp2/e;
.super Lq1/b;
.source "SourceFile"


# static fields
.field public static final c:Lp2/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp2/e;

    invoke-direct {v0}, Lp2/e;-><init>()V

    sput-object v0, Lp2/e;->c:Lp2/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xb

    const/16 v1, 0xc

    invoke-direct {p0, v0, v1}, Lq1/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(Lu1/c;)V
    .locals 1

    const-string v0, "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {p1, v0}, Lu1/c;->m(Ljava/lang/String;)V

    return-void
.end method
