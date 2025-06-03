.class public final Lnc/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnc/d0;


# static fields
.field public static final a:Lnc/d1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnc/d1;

    invoke-direct {v0}, Lnc/d1;-><init>()V

    sput-object v0, Lnc/d1;->a:Lnc/d1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f()Lub/h;
    .locals 1

    sget-object v0, Lub/i;->a:Lub/i;

    return-object v0
.end method
