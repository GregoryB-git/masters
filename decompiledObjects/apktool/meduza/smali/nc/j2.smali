.class public final Lnc/j2;
.super Lub/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnc/j2$a;
    }
.end annotation


# static fields
.field public static final c:Lnc/j2$a;


# instance fields
.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnc/j2$a;

    invoke-direct {v0}, Lnc/j2$a;-><init>()V

    sput-object v0, Lnc/j2;->c:Lnc/j2$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lnc/j2;->c:Lnc/j2$a;

    invoke-direct {p0, v0}, Lub/a;-><init>(Lub/h$c;)V

    return-void
.end method
